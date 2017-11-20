package com.train.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.train.dao.entity.User;
import com.train.exception.ResponseData;
import com.train.model.UserInfo;
import com.train.service.UserService;
import com.train.util.StringUtils;

@RestController
@RequestMapping("/User")
public class UserAction {

	@Autowired
	private UserService userServie;

	//, method = RequestMethod.GET
	
	
	@RequestMapping(value = "/login")
	public Object login(UserInfo user) throws Exception {

		User user2 = userServie.selectByPrimaryKey(user.getUserid());
		System.out.println("-------------------");
		return ResponseData.success(user);
	}
	
	
	@RequestMapping(value = "/register")
	public Object register(@RequestBody UserInfo user) throws Exception {
		if(StringUtils.isEmpty(user.getUserna())||StringUtils.isEmpty(user.getMobile())){
			throw new Exception("参数错误");
		}
		if(StringUtils.isEmpty(user.getPasswd())){
			throw new Exception("参数错误");
		}
		
		
		int i = userServie.insertSelective(user);
		System.out.println("-------------------"+i);
		//System.out.println(user.getUserna());
		return ResponseData.success(user);
	}

}
