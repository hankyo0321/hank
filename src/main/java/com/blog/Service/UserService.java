package com.blog.Service;

import com.blog.pojo.User;



public interface UserService {

	User checkuser(String username ,String password) throws Exception;
}
