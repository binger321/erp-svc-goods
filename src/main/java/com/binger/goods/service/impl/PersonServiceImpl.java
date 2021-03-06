package com.binger.goods.service.impl;

import com.binger.common.exception.BusinessException;
import com.binger.common.util.DozerUtils;
import com.binger.goods.dao.PersonMapper;
import com.binger.goods.dao.UserMapper;
import com.binger.goods.domain.Person;
import com.binger.goods.domain.PersonExample;
import com.binger.goods.domain.User;
import com.binger.goods.domain.UserExample;
import com.binger.goods.service.PersonService;
import com.binger.goods.vo.PersonVo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public Long count(PersonExample personExample) {
        return personMapper.countByExample(personExample);
    }


    @Override
    public List<PersonVo> listByExample(PersonExample personExample) {
        List<Person> personList = (personMapper.selectByExample(personExample));
        if (personList != null) {
            return DozerUtils.convertList(personList, PersonVo.class);
        } else {
            throw BusinessException.create("该数据不存在");
        }
    }

    @Override
    public PersonVo findById(Integer id) {
        Person person = personMapper.selectByPrimaryKey(id);
        if (null != person) {
            return DozerUtils.convert(person, PersonVo.class);
        } else {
            throw BusinessException.create("不存在该人员ID，请确认后输入");
        }
    }

    @Override
    public PersonVo updateById(Person person, Integer id) {
        checkPersonUnique(person, id);
        Person person1 = personMapper.selectByPrimaryKey(id);
        if (person1 == null) {
            throw BusinessException.create("无法找到该人员");
        }
        person.setId(id);
        personMapper.updateByPrimaryKeySelective(person);
        Person person2 = personMapper.selectByPrimaryKey(id);
        if (person2 != null) {
            return DozerUtils.convert(person2, PersonVo.class);
        } else {
            return null;
        }
    }

    private void checkPersonUnique(Person person, Integer id) {
        PersonExample example = new PersonExample();
        PersonExample.Criteria criteria = example.createCriteria();
        criteria.andPersonCodeEqualTo(person.getPersonCode());
        if (id != null) {
            criteria.andIdNotEqualTo(id);
        }
        long count = personMapper.countByExample(example);
        if (count > 0) {
            throw BusinessException.create("人员编号已存在");
        }
    }


    @Override
    public PersonVo add(Person person) {
        if (StringUtils.isEmpty(person.getPersonCode())) {
            throw BusinessException.create("人员编号不能为空");
        }
        checkPersonUnique(person, null);
        person.setCategory("普通员工");
        personMapper.insertSelective(person);
        Person person1 = personMapper.selectByPrimaryKey(person.getId());
        if (person1 != null) {
            return DozerUtils.convert(person1, PersonVo.class);
        } else {
            throw BusinessException.create("新增失败！");
        }

    }

    @Override
    public Integer deleteById(Integer id) {
        Person person = personMapper.selectByPrimaryKey(id);
        if (person == null) {
            throw BusinessException.create("未找到该人员，可能已被删除");
        }
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andPersonIdEqualTo(id);
        long userCount = userMapper.countByExample(example);
        if (userCount > 0) {
            BusinessException.create("需先删除人员对应的用户，再删除人员");
        }

        int count = personMapper.deleteByPrimaryKey(id);
        if (count > 0) {
            return count;
        } else {
            throw BusinessException.create("删除失败");
        }
    }
}
