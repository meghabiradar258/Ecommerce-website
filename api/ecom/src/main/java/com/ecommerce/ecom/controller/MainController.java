package com.ecommerce.ecom.controller;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ecommerce.ecom.model.User;
import com.ecommerce.ecom.service.MainService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class MainController {

	@Autowired()
	MainService service;
	
	@RequestMapping("/register")
	public boolean Register(@RequestBody User user) {
		try 
		{
			return this.service.Register(user);
		} 
		catch(Exception e)
		{
			return false;
		}
	}
	
	@PostMapping("/auth")
	public boolean Login(@RequestBody User user) {
		try
		{
			return this.service.Login(user);
		}
		catch(Exception e)
		{
			return false;
		}
	}
}
