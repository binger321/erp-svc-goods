package com.binger.goods.dao;

import com.binger.goods.domain.User;
import com.binger.goods.domain.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExampleWithColSelected(UserExample example);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKeyWithColSelected(@Param("id") Integer id, @Param("selectiveField") UserExample.SelectiveField selectiveField);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}