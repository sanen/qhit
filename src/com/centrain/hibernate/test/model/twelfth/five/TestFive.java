package com.centrain.hibernate.test.model.twelfth.five;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.centrain.hibernate.model.twelfth.manymany.Server;
import com.centrain.hibernate.model.twelfth.manymany.User;


public class TestFive { 

	
	
	public static void addSomeUserAndtoAddSomeServer(){
		
		Session session=new Configuration().configure("hibernate.cfg6.xml").buildSessionFactory().openSession();
		
		Transaction tx=null;
		
		try {
			tx=session.beginTransaction();
			
			Server server=new Server();
			Server server2=new Server();

			Set<Server> servers=new HashSet<Server>();
			
			User user=new User();
			User user2=new User();
			
			user.setName("b");
			user2.setName("aa");
			
			
			server.setAddress("qhitb");
			server2.setAddress("qhitAA");		
			
			servers.add(server);
			servers.add(server2);
			
			user.setServers(servers);
			user2.setServers(servers);
						
			session.save(user);
			session.save(user2);
			
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		
	}
	
	
	public static User getUser(String name){
		User user=new User();
		user.setName(name);
		return user;
	}

	public static Server getServer(String address){
		
		Server server=new Server();
		server.setAddress(address);
		return server;
	}

	public static void addServertoAddManyUser(int i){
		
		Session session=new Configuration().configure("hibernate.cfg6.xml").buildSessionFactory().openSession();
		
		Transaction tx=null;
		try {
			tx=session.beginTransaction();

			Server server=new Server(); //getServer(");
			
			server.setAddress("test2");
			
			Set<User> users=new HashSet<User>();
			
			
			if(i==1){
				
				users.add((User)session.get(User.class,(long) 5));
				users.add((User)session.get(User.class,(long) 6));
			}else{
					users.add((User)session.get(User.class,(long) 4));
				users.add((User)session.get(User.class,(long) 4));
			}
			
			server.setUsers(users);
			 
			session.save(server);
			
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}	
	}
	

	public static void addUsertoAddManyServer(){
		
		Session session=new Configuration().configure("hibernate.cfg6.xml").buildSessionFactory().openSession();
		
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			
			User user=getUser("wangwu");
			
			Set<Server> servers=new HashSet<Server>();
			
			servers.add((Server)session.get(Server.class, (long)3));
			servers.add((Server)session.get(Server.class, (long)4));
			
			user.setServers(servers);
			
			session.save(user);
			
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}	
	}
	

	public static void addServerAndtoAddUser(){
		
		Session session=new Configuration().configure("hibernate.cfg6.xml").buildSessionFactory().openSession();
		
		Transaction tx=null;
		
		try {
			tx=session.beginTransaction();
			
			
			Server server=new Server();
								
			server.setAddress("good");
			
				Set<User> users=new HashSet<User>();
				User user=new User();
				user.setName("zhangsan");
				users.add(user);
			
			server.setUsers(users);
			
			session.save(server);
			
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
//		addSomeUserAndtoAddSomeServer();
		
//		addServertoAddManyUser(1);
		
//		addServertoAddManyUser(2);
		
//		addUsertoAddManyServer();
		
//		addServerAndtoAddUser();
		
		
	}
}
