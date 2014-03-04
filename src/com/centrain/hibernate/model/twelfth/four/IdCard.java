package com.centrain.hibernate.model.twelfth.four;

import java.io.Serializable;

public class IdCard implements Serializable {

	/**
	 * 实体映射 一对一
	 */
	private static final long serialVersionUID = 2516165091164474257L;
	private long id;
	private String cname;
	private Person person;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
}
