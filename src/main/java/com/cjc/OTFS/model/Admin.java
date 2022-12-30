package com.cjc.OTFS.model;

import java.util.Arrays;

import javax.persistence.Entity;


public class Admin {

	private String username;
	private char[] password;

	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String username, char[] password) {
		super();
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [username=" + username + ", password=" + Arrays.toString(password) + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	
	
}
