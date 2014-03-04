package com.centrain.hibernate.center.thirteenth.cache.test;


import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.centrain.hibernate.center.thirteenth.cache.User;



/**
 * 
 * 缓存：即实现应用程序与数据库 
 * 
 * 缓存均针对的是同一缓存资源
 * 
 * get() load()   优势：获取单条数据
 * Query Criteria 优势：获取多条数据
 *
 */
public class UserTest { 
	
	private SessionFactory sf = new Configuration().configure("hibernate.cfg132.xml").buildSessionFactory() ;
	
	Logger lg = Logger.getLogger(UserTest.class.getName()) ;
	
	/**
	 * 一级缓存  即Session
	 * 
	 * 原理： 同一session多次访问同一数据资源 
	 *       hibernate 只发送一条查询语句
	 * 若使用 session.evict() 或session.clear() 则会发送多条查询语句  前提是没有设置二级缓存 . 三级缓存只适用于Query(查询)
	 * 
	 * 		原因是：session.evict()会清除Session缓存中存在的指定的对象资源
	 * 			   session.clear()会清除Session缓存中存在的所有对象资源
	 * 
	 */
	public void test1(){
		
		Session session  = sf.openSession();
		User user1 = (User)session.get(User.class, 1) ;
		System.out.println(user1.getName());
		//从一级缓存中踢出user1对象  
		
//		session.evict(user1) ;   
//		session.clear() ;
		System.out.println("--------user1.name-----------------");
		
		User user2 = (User)session.get(User.class, 1) ;
		
		System.out.println(user2.getName());
		session.close() ; 
	}
	
	/**
	 * 二级缓存 即 SssionFactory 
	 * 
	 * 使用二级缓存  1 指名二级缓存方式 2 指名对应二级缓存方式的厂商  3指名使用二级缓存的实体
	 * 
	 * 当不同session访问同一资源时,hibernate 发送一条sql语句。反之 发送多条查询语句
	 *  
	 */
	public void test2(){
		
		Session session1  = sf.openSession();
		Session session2  = sf.openSession();
		
		User user1 = (User)session1.get(User.class, 1) ;
	 
		System.out.println(user1.getName());
//		session1.evict(user1); 
		System.out.println("--------user1.name-----------------");
		
		User user2 = (User)session2.get(User.class, 1) ;
		
		System.out.println(user2.getName());
		
		
		session2.close() ;
		session1.close() ;
		
	}
	
	
	/**
	 * 三级缓存(查询缓存) Query  list() iterator()
	 * 使用三级缓存需配置：1 <!-- 打开查询缓取 -->	
	 *			         <property name="cache.use_query_cache">true</property>	
	 *				   2 需配置 Query对象的setCacheable(true)
	 * 
	 */
	@SuppressWarnings("unchecked")
	public void test3(){
		Session session  = sf.openSession();
		Query query = session.createQuery("from User where id=1") ;
		//激活查询缓存
		query.setCacheable(true) ;
		List<User> users1 = query.list() ;
		
		for(User u:users1){
			System.out.println(u.getName());
		}
		
		System.out.println("---------query.list()-------------");
		
		List<User> users2 = query.list() ;
		for(User u:users2){
			System.out.println(u.getName());
		}
		session.close() ;
	}
	
	
	/**
	 * 二级缓存 即 SssionFactory   
	 * 使用二级缓存:
	 *			
	 * 当不同session访问同一资源时,hibernate 发送一条sql语句。反之发送多条查询语句
	 *  
	 */
	
	@SuppressWarnings("unchecked")
	public void test33(){
		
		Session session1  = sf.openSession();
		Session session2  = sf.openSession();
		
		Query query=session1.createQuery("from User");
		
		query.setCacheable(true) ;
		
		List<User> list=query.list();
		for(User u:list){ 
			System.out.println(u.getName());
		}
       
		System.out.println("--------user1.name-----------------");
		
		Query query2=session1.createQuery("from User");
		query2.setCacheable(true) ;
		List<User> list2=query2.list();
		for(User u:list2){ 
			System.out.println(u.getName());
		}
		
		session2.close() ;
		session1.close() ;
	}
	
	
	
	public void log4j(){
		lg.debug("test debug");
	}
	
	public static void main(String[] args) {
		
		//一级缓存 Session
//		new UserTest().test1() ;
		
		//二级缓存 SessionFactory
		new UserTest().test2() ;
		
		//三级缓存 Query
//		new UserTest().test3() ;   //一个 Query 对象
//		new UserTest().test33() ;  //多个 Query 对象
		
		//test log4j
//		new UserTest().log4j();
	}

}
