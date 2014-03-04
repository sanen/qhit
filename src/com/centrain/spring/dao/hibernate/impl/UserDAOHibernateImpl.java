package com.centrain.spring.dao.hibernate.impl;

import java.util.List;

//import org.springframework.aop.framework.ProxyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
//import org.hibernate.dialect.SQLServerDialect;
 
import com.centrain.hibernate.spring.model.sixteen.User;
import com.centrain.spring.dao.UserDAO;

 
public class UserDAOHibernateImpl extends HibernateDaoSupport implements UserDAO {
    
	
	private HibernateTemplate ht;


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
		ht=super.getHibernateTemplate(); 
		ht.save(user); 
		return false;
	}

	public boolean updateUser(User user) {
		return false;
	}

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		UserDAOHibernateImpl userdao=(UserDAOHibernateImpl)ac.getBean("SHuserdao");
		User user=new User();
		user.setId(1); 
		user.setUsername("lisifrd");   
		userdao.insertUser(user);
	} 


	
}
