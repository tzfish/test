package com.train.service;

import com.train.dao.entity.User;
import com.train.model.UserInfo;

public interface UserService {

	int deleteByPrimaryKey(Integer userid);

	int insert(UserInfo record);

	int insertSelective(UserInfo record);

	User selectByPrimaryKey(Integer userid);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

}