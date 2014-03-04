package com.centrain.hibernate.center.thirteenth.cache;

import java.io.Serializable;

/**
 * 
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class Account implements Serializable {
	private int id ;
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
}
