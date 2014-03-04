package com.centrain.hibernate.model.twelfth.manymany;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("serial")
public class User implements Serializable{

	private long id;
	private String name;
	
	private Set<Server> servers=new HashSet<Server>();
	
	public User(){}
		
	public User(String name) {
		super();
		this.name = name;
	}
	
	public User(String name, Set<Server> servers) {
		super();
		this.name = name;
		this.servers = servers;
	}



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

	public Set<Server> getServers() {
		return servers;
	}

	public void setServers(Set<Server> servers) {
		this.servers = servers;
	}
	
}
