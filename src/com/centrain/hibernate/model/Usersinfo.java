package com.centrain.hibernate.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Usersinfo implements Serializable {

	private int id;
	private int age;
	private String sex;
	private String username;
	public Usersinfo(){}
	
	public Usersinfo(int age, String sex, String username) {
		super();
		this.age = age;
		this.sex = sex;
		this.username = username;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
