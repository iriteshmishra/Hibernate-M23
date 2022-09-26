package com.cg.service;

import com.cg.entities.User;

public interface UserService 
{
	User addNewUser(User user);
	User updateUser(User user);
	User login(User user);
	boolean logOut();
}
