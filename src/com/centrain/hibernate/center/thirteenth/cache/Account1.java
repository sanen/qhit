package com.centrain.hibernate.center.thirteenth.cache;

import java.io.Serializable;
@SuppressWarnings("serial")
public class Account1 implements Serializable {
	private int id ;
	private int version ;
	private int balance ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
}
