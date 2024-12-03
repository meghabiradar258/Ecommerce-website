package com.ecommerce.ecom.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity(name = "user")
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	int uid;
	String username;
	String email;
	String pass;
	
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", email=" + email + ", pass=" + pass + "]";
	}
	
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int uid, String username, String email, String pass) {
		super();
		this.uid = uid;
		this.username = username;
		this.email = email;
		this.pass = pass;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
