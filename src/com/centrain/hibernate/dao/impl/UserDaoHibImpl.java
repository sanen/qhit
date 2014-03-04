package com.centrain.hibernate.dao.impl;

import java.util.List;


import com.centrain.hibernate.dao.UserDAO;
import com.centrain.hibernate.model.User;

public  class UserDaoHibImpl extends BaseDAO implements UserDAO {

	
	public void delete(int id) {
		super.delete(User.class, id);
	}

	public void insert(User user) {
		super.insert(user);
	}

	public User selectByid(int id) {
		User user=(User)super.get(User.class, id);
		return user;
	}

	public void update(User user) {
		super.update(user);
	}

	@SuppressWarnings("unchecked")
	public List<User> selectAll(String entity) {
		List<User> list=(List<User>) super.getAll(entity);
		return list;
	}

	

}
