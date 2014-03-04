package com.centrain.hibernate.spring.model.sixteen;

import java.io.Serializable;

@SuppressWarnings("serial")
public class User implements Serializable {

	private int id;
	private String username;
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
	
}
