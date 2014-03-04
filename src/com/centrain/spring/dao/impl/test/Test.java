package com.centrain.spring.dao.impl.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.centrain.hibernate.spring.model.sixteen.User;
import com.centrain.spring.dao.UserDAO;
import com.centrain.spring.dao.hibernate.impl.UserDAOHibernateImpl;
import com.centrain.spring.dao.jdbc.impl.UserDAOJdbcImpl;


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
	
	public static void ByJdbcTest(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		UserDAOJdbcImpl ser=(UserDAOJdbcImpl)ac.getBean("springuserdao");
		User user=new User(); 
		user.setUsername("zhangsan"); 
		ser.insertUser(user); 
	}
	
	public static void ByHibernateTest(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		UserDAOHibernateImpl ser=(UserDAOHibernateImpl)ac.getBean("SHuserdao");
		User user=new User(); 
		user.setUsername("lisi"); 
		ser.insertUser(user); 
	}
	
	public static void main(String[] args) {
		ByHibernateTest();
		ByJdbcTest();
	}
	
}
