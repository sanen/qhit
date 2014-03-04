package com.centrain.hibernate.model.twelfth.three;

import java.io.Serializable;
/**
 * 订单对客户 多对一 设置 订单   many-to-one
 * 
 * 客户对订单 一对多 设置 客户   one-to-many
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
