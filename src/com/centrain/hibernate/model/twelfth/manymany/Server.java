package com.centrain.hibernate.model.twelfth.manymany;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author zhangkehua
 *  实体映射之 多对多
 */

@SuppressWarnings("serial")
public class Server implements Serializable {

	private long id;
	private String address;
	private Set<User> users=new HashSet<User>();
	
	public Server(String address, Set<User> users) {
		super();
		this.address = address;
		this.users = users;
	}


	public Server(){}
	
	
	public Server(String address) {
		super();
		this.address = address;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
	
}
