package com.binger.goods.service.impl;

import com.binger.common.exception.BusinessException;
import com.binger.common.util.DozerUtils;
import com.binger.goods.dao.UserMapper;
import com.binger.goods.domain.User;
import com.binger.goods.domain.UserExample;
import com.binger.goods.dto.query.UserQueryDto;
import com.binger.goods.service.UserService;
import com.binger.goods.vo.UserVo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.DigestUtils;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;


    @Override
    public long count(UserExample userExample) {
        return userMapper.countByExample(userExample);
    }

    @Override
    public List<UserVo> listByExample(UserExample userExample) {
        List<User> userList = userMapper.selectByExample(userExample);
        if (userList != null) {
            return DozerUtils.convertList(userList, UserVo.class);
        } else {
            throw BusinessException.create("数据不存在");
        }
    }

    @Override
    public UserVo findById(Integer id) {
        User user = userMapper.selectByPrimaryKey(id);
        if (null != user) {
            return DozerUtils.convert(user, UserVo.class);
        } else {
            throw BusinessException.create("不存在该用户ID,请确认后输入");
        }
    }

    @Override
    public UserVo updateById(User user, Integer id) {
        User user1 = userMapper.selectByPrimaryKey(id);
        if (user1 == null) {
            throw BusinessException.create("无法找到该用户");
        }
        user.setUserPassword(DigestUtils.md5DigestAsHex(user.getUserPassword().getBytes()));
        checkUserUnique(user, id);
        long count = userMapper.updateByPrimaryKeySelective(user);
        if (count > 0) {
            return DozerUtils.convert(userMapper.selectByPrimaryKey(id), UserVo.class);
        } else {
            throw BusinessException.create("修改失败，可能重复操作");
        }
    }

    @Override
    public UserVo add(User user) {
        checkUserUnique(user, null);
        user.setUserPassword(DigestUtils.md5DigestAsHex(user.getUserPassword().getBytes()));
        long result = userMapper.insertSelective(user);
        if (result > 0) {
            return DozerUtils.convert(userMapper.selectByPrimaryKey(user.getId()), UserVo.class);
        } else {
            throw BusinessException.create("新增失败！");
        }

    }

    private void checkUserUnique(User user, Integer id) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserCodeEqualTo(user.getUserCode());
        if (id != null) {
            criteria.andIdNotEqualTo(id);
        }
        long count = userMapper.countByExample(example);
        if (count > 0) {
            throw BusinessException.create("用户编号已存在！");
        }

        example.clear();
        UserExample.Criteria criteria1 = example.createCriteria();
        criteria1.andUserNameEqualTo(user.getUserName());
        if (id != null) {
            criteria.andIdNotEqualTo(id);
        }
        count = userMapper.countByExample(example);
        if (count > 0) {
            throw BusinessException.create("用户名已存在！");
        }

        example.clear();
        UserExample.Criteria criteria2 = example.createCriteria();
        criteria2.andPersonIdEqualTo(user.getPersonId());
        if (id != null) {
            criteria.andIdNotEqualTo(id);
        }
        count = userMapper.countByExample(example);
        if (count > 0) {
            throw BusinessException.create("该人员已有对应的用户！");
        }
    }


    @Override
    public Integer deleteById(Integer id) {
        User user = userMapper.selectByPrimaryKey(id);
        if (user == null) {
            throw BusinessException.create("未找到该用户，可能已被删除");
        }
        int count = userMapper.deleteByPrimaryKey(id);
        if (count > 0) {
            return count;
        } else {
            throw BusinessException.create("删除失败");
        }
    }

    @Override
    public long countByQuery(UserQueryDto userQueryDto) {
        return userMapper.countByQuery(userQueryDto);
    }

    @Override
    public List<UserVo> listByQuery(UserQueryDto userQueryDto) {
        List<UserVo> userVoList = userMapper.listByQuery(userQueryDto);
        if (CollectionUtils.isEmpty(userVoList)) {
            return null;
        } else {
            return userVoList;
        }
    }
}
