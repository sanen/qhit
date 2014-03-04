package com.centrain.hibernate.model.twelfth.four;

import java.io.Serializable;
/*
 * 实体映射之 一对一 单双向映射 
 */
public class Room implements Serializable {

	/**
	 * 实体映射 一对一
	 */
	private static final long serialVersionUID = -204131186706738906L;
	private long id;
	private String address;
	
	private People people;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public People getPeople() {
		return people;
	}
	public void setPeople(People people) {
		this.people = people;
	}
	
	
	
	
}
