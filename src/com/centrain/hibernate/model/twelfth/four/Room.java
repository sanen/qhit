package com.centrain.hibernate.model.twelfth.four;

import java.io.Serializable;
/*
 * ʵ��ӳ��֮ һ��һ ��˫��ӳ�� 
 */
public class Room implements Serializable {

	/**
	 * ʵ��ӳ�� һ��һ
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
