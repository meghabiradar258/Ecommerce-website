package com.ecommerce.ecom.service;

import com.ecommerce.ecom.model.User;

public interface MainServiceInterface {
//	to register the user
	public boolean Register(User user);
	
//	to authenticate the user in order to login
	public boolean Login(User user);
}
