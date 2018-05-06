package com.binger.goods.service;


import com.binger.goods.domain.User;
import com.binger.goods.domain.UserExample;
import com.binger.goods.vo.UserVo;

import java.util.List;

public interface UserService {

    long count(UserExample userExample);

    List<UserVo> listByExample(UserExample userExample);

    UserVo findById(Integer id);

    UserVo updateById(User user, Integer id);

    UserVo add(User user);

    Integer deleteById(Integer id);
}
