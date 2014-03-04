package com.centrain.hibernate.model.twelfth.three;

import java.io.Serializable;
/**
 * �����Կͻ� ���һ ���� ����   many-to-one
 * 
 * �ͻ��Զ��� һ�Զ� ���� �ͻ�   one-to-many
 * 
 * @author zhangkehua
 *
 */
@SuppressWarnings("serial")
public class Order2 implements Serializable {

	private long id;
	private String orderNumber;
	private Customer2 customer2;
	
	
	
	
	public Order2(){}
	 
	public Order2(String orderNumber, Customer2 customer2) {
		
		this.orderNumber = orderNumber;
		this.customer2 = customer2;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public Customer2 getCustomer2() {
		return customer2;
	}
	public void setCustomer2(Customer2 customer2) {
		this.customer2 = customer2;
	}
	
	
	
	
}
