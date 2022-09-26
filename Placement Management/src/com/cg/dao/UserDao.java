package com.cg.dao;

import com.cg.entities.User;

public interface UserDao 
{

	User addNewUser(User user);
	User updateUser(User user);
	User deleteUser(int user_id);
	
	public abstract void beingTransaction();
	public abstract void commitTransaction();

}
