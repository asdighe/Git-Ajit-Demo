package com.cjc.OTFS.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tutor {

	@Id
	private int tutorId;
	private String username;
	private char [] password;
	private String name;
	private String email;
	private Long mobno;
	private String address;
	private String subject;
	
	
	
	public Tutor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tutor(int tutorId, String username, char[] password, String name, String email, Long mobno, String address,
			String subject) {
		super();
		this.tutorId = tutorId;
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
		this.mobno = mobno;
		this.address = address;
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Tutor [tutorId=" + tutorId + ", username=" + username + ", password=" + Arrays.toString(password)
				+ ", name=" + name + ", email=" + email + ", mobno=" + mobno + ", address=" + address + ", subject="
				+ subject + "]";
	}
	
	public int getTutorId() {
		return tutorId;
	}
	public void setTutorId(int tutorId) {
		this.tutorId = tutorId;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}
