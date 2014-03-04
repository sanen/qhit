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
public class Order implements Serializable {

	private long id;
	private String orderNumber;
	
	private Customer customer;

	
	public Order(){}
	
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
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Order(String orderNumber, Customer customer) {
		super();
		this.orderNumber = orderNumber;
		this.customer = customer;
	}
	
	
}
