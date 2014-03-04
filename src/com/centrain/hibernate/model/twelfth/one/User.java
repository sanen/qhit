package com.centrain.hibernate.model.twelfth.one;

import java.io.Serializable;
/*
 * ¼Ì³ÐÓ³Éä ¸¸Àà
 */
public class User implements Serializable {

	/**
	 * ÐòÁÐ»¯°æ±¾×Ö·û´®
	 */
	private static final long serialVersionUID = -2361837251732101392L;
	
	private String id;
	private String name;
	private String password;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
