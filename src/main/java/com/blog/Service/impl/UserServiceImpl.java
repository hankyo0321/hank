package com.blog.Service.impl;

import com.blog.Service.UserService;
import com.blog.pojo.User;
import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;


@Service
public class UserServiceImpl implements UserService {
	
	 final String username1="HANK";
	 final String password1="woosa0321";

	@Override
	public User checkuser(String username, String password) throws Exception {
		User user = check(username,password);
		return user;
	}

	private User check(String username, String password) throws Exception {
		if(StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
			throw new Exception("帳號或密碼為空");
		}
		
		User user = new User();
		Date day= new Date();
		if(username == this.username1 && password == this.password1) {
			user.setUsername(username);
			user.setUsername(password);
			user.setCreateTime(day);
			user.setEmail("123@123");
			return user;
		}
		
		return null;
	}

}
