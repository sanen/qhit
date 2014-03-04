package com.centrain.ssh.service;

import java.util.List;

import com.centrain.ssh.orm.User;

public interface UserService {

public boolean addUser(User user);
	
	public boolean deleteUser(int id);
	
	public boolean udpateUser(User user);
	
	public User getUserById(int id);
	
	public List<User> getUsers();
	
	public List<User> getUsersByFenYe(int pageid,int pagesize);
}
