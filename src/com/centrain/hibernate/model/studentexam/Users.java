package com.centrain.hibernate.model.studentexam;

import java.io.Serializable;
@SuppressWarnings("serial")
public class Users implements Serializable {

	private int id;
	private String username;
	private String password;
	private int ismanager;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getIsmanager() {
		return ismanager;
	}
	public void setIsmanager(int ismanager) {
		this.ismanager = ismanager;
	}
	
	
	
	
	
	
}
