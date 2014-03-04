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
