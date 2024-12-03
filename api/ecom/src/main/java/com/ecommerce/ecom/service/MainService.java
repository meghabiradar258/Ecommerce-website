package com.ecommerce.ecom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecom.model.User;
import com.ecommerce.ecom.repository.UserRepository;

@Service
public class MainService implements MainServiceInterface {

	//create database object for user table
	@Autowired
	UserRepository db;
	
//	override & implement register interface
	@Override
	public boolean Register(User user) {
		
		try {
			db.save(user);
			return true;
		}
		catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	@Override
	public boolean Login(User user) {
		try
		{
			List<User> users = db.findByUsernameAndPass(user.getUsername(), user.getPass());
//			System.out.print(usersList);
			if(!users.isEmpty())
			{
//				System.out.print(users);
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception e)
		{
			return false;
		}
	}
}
