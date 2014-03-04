package com.centrain.spring.dao.impl;
import java.util.List;

import com.centrain.hibernate.spring.model.sixteen.User;
import com.centrain.spring.dao.UserDAO;


public class Test implements UserDAO{

	public boolean deleteUser(int id) {
		return false;
	} 

	public List<User> getQuery() {
		return null;
	}

	public User getUserById(int id) {
		return null;
	}

	public boolean insertUser(User user) {
		return false;
	}

	public boolean updateUser(User user) {
		return false;
	} 
	
} 