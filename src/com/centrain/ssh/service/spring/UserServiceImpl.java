package com.centrain.ssh.service.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.centrain.ssh.dao.UserDAO;
import com.centrain.ssh.orm.User;
import com.centrain.ssh.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDAO userDAO;
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public boolean addUser(User user) {
		return userDAO.addUser(user);
	}

	public boolean deleteUser(int id) {
		return userDAO.deleteUser(id);
	}

	public User getUserById(int id) {
		return userDAO.getUserById(id);
	}

	public List<User> getUsers() {
		return userDAO.getUsers();   
	}

	public List<User> getUsersByFenYe(int pageid, int pagesize) {
		return userDAO.getUsersByFenYe(pageid, pagesize);
	}

	public boolean udpateUser(User user) {
		return userDAO.udpateUser(user);
	}
	
	
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		UserService test=(UserService)ac.getBean("userservice");
		User user=new User();
		user.setAge(20);
		user.setEmail("zhangsan@163.com");
		user.setPassword("zhangsan");
		user.setUsername("zhangsan");
		test.addUser(user);
	} 

}
