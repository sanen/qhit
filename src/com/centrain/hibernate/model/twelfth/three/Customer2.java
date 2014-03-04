package com.centrain.hibernate.model.twelfth.three;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
@SuppressWarnings("serial")
public class Customer2 implements Serializable {

	private long id;
	private String name;
	private String address;
	
	private Set<Order2> orders=new HashSet<Order2>();

	public Customer2(){}
	
	public Customer2(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

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

	public Set<Order2> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order2> orders) {
		this.orders = orders;
	}
	
	
	
}
