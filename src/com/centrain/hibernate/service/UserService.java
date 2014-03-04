package com.centrain.hibernate.service;

import java.util.List;

import com.centrain.hibernate.model.User;

public interface UserService {

public void insert(User user);
	
	public void delete(int id);
	
	public void update(User user);
	
	public User selectByid(int id);
	
	public List<User> selectAll(String entity);
	
}
