package com.centrain.spring.dao;

import java.util.List;

import com.centrain.hibernate.spring.model.sixteen.User;

/**
 * 十锟斤拷锟斤拷
 * @author 锟脚科伙拷
 *
 */
public interface UserDAO {
 
	public boolean insertUser(User user);
	
	public boolean updateUser(User user);
	
	public boolean deleteUser(int id);
	
	public User getUserById(int id);
	
	public List<User> getQuery(); 
}
