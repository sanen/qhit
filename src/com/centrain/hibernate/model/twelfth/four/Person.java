package com.centrain.hibernate.model.twelfth.four;

import java.io.Serializable;

public class Person implements Serializable {

	/**
	 * ʵ��ӳ�� һ��һ
	 */
	private static final long serialVersionUID = -7912785421264572711L;
	private long id;
	private String name;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
