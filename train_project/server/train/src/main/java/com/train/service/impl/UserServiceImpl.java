package com.train.service.impl;

import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.train.dao.UserLoginMapper;
import com.train.dao.UserMapper;
import com.train.dao.entity.User;
import com.train.dao.entity.UserLogin;
import com.train.model.UserInfo;
import com.train.service.UserService;
import com.train.util.UUIDUtil;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private UserLoginMapper userLoginMapper;

	@Override
	public int deleteByPrimaryKey(Integer userid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Transactional
	public int insert(UserInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * 添加用户信息
	 * 
	 * @see
	 * com.train.service.UserService#insertSelective(com.train.dao.entity.User)
	 */
	public int insertSelective(UserInfo record) {
		Date date = new Date();
		record.setJointi(date);
		int row = userMapper.insertSelective(record);
		UserLogin login = new UserLogin();
		login.setUserid(record.getUserid());
		String sessid = UUIDUtil.uuid();
		login.setSessid(sessid);
		login.setToken(record.getToken());
		login.setDevitp(record.getDevitp());
		login.setLongti(date);
		String passwd = record.getPasswd();
		String newpwd = DigestUtils.md5Hex(record.getUserid() + passwd.toUpperCase()).toUpperCase();
		login.setPasswd(newpwd);
		userLoginMapper.insertSelective(login);
		return row;
	}

	@Override
	public User selectByPrimaryKey(Integer userid) {
		return userMapper.selectByPrimaryKey(userid);
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
