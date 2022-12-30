package com.cjc.OTFS.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Parent {

	@Id
	private int parentId;
	private String username;
	private char [] password;
	private String email;
	private String parentname;
	private Long mobno;
	private String address;
	
	
	
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Parent(int parentId, String username, char[] password, String email, String parentname, Long mobno,
			String address) {
		super();
		this.parentId = parentId;
		this.username = username;
		this.password = password;
		this.email = email;
		this.parentname = parentname;
		this.mobno = mobno;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Parent [parentId=" + parentId + ", username=" + username + ", password=" + Arrays.toString(password)
				+ ", email=" + email + ", parentname=" + parentname + ", mobno=" + mobno + ", address=" + address + "]";
	}
	
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getParentname() {
		return parentname;
	}
	public void setParentname(String parentname) {
		this.parentname = parentname;
	}
	public Long getMobno() {
		return mobno;
	}
	public void setMobno(Long mobno) {
		this.mobno = mobno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
