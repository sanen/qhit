package com.centrain.hibernate.dao;

import java.util.List;

import com.centrain.hibernate.model.User;
//users
public interface UserDAO {

	public void insert(User user);
	
	public void delete(int id);
	
	public void update(User user);
	
	public User selectByid(int id);
	
	public List<User> selectAll(String entity);
}
