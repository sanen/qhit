package com.centrain.hibernate.center.thirteenth.lock;

import java.io.Serializable;
@SuppressWarnings("serial")

public class Acount implements Serializable {
	
	private int id;

	private int money;
	private Person person;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	

}
