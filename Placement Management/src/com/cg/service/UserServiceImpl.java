package com.cg.service;

import java.util.Scanner;

import com.cg.dao.UserDao;
import com.cg.dao.UserDaoImpl;
import com.cg.entities.User;

public class UserServiceImpl implements UserService
{

private UserDao dao;
Scanner s=new Scanner(System.in);
	
	public UserServiceImpl() {
		super();
		dao=new UserDaoImpl();
	}

	@Override
	public User addNewUser(User user) {
		dao.beingTransaction();
		dao.addNewUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User updateUser(User user) {
		dao.beingTransaction();
		dao.updateUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User login(User user) {
		System.out.println("Enter the user name: ");
		String uName=s.nextLine();
		System.out.println("Enter the Password: ");
		String uPassword=s.nextLine();
		if(uName==user.getName() && uPassword==user.getPassword())
		{
			return user;
		}
		else
		{
			System.out.println("Invalid user Name or Password");
		}
		return null;
	}

	@Override
	public boolean logOut() {
		System.exit(0);
		return true;

	}
	
}
