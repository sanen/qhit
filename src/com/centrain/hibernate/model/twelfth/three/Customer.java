package com.centrain.hibernate.model.twelfth.three;

import java.io.Serializable;

/**
 * 
 * @author zhangkehua
 * ¹Ë¿ÍÊµÌå
 */

@SuppressWarnings("serial")
public class Customer implements Serializable {
   
	
	private long id;
	private String name;
	private String address;

	public Customer(){}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Customer(String name, String address) {
		
		this.name = name;
		this.address = address;
	}
	
	
	
}
