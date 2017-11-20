package com.train.dao;

import org.apache.ibatis.annotations.Mapper;
import com.train.dao.entity.UserLogin;

@Mapper
public interface UserLoginMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(UserLogin record);

    int insertSelective(UserLogin record);

    UserLogin selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(UserLogin record);

    int updateByPrimaryKey(UserLogin record);
}