package com.centrain.hibernate.model.twelfth.two;

import java.io.Serializable;
/*
 * �̳�ӳ�� ����
 */
public class GoodBook extends Book implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4233522071804236814L;
	private String country;
	private int number;//ͼ������
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
}
