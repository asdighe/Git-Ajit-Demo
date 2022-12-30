package com.cjc.OTFS.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ebook {

	@Id
	private int bookId;
	private String subject;
	private double price;
	private int standard;
	
	
	public Ebook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ebook(int bookId, String subject, double price, int standard) {
		super();
		this.bookId = bookId;
		this.subject = subject;
		this.price = price;
		this.standard = standard;
	}

	@Override
	public String toString() {
		return "Ebook [bookId=" + bookId + ", subject=" + subject + ", price=" + price + ", standard=" + standard + "]";
	}
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	
	
}
