package com.centrain.hibernate.center;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.centrain.hibernate.model.twelfth.three.Order;

public class LazyInverseFetchCascade {
	

	/**
	 * 1、2 lazy 懒加载
	 */
	
	/**
	 * 1  lazy get()
	 * 
	 * 测试  lazy=true or false  get()   
	 * 
	 * lazy=true 支持懒加载 即session关闭后不能获取关联实体的信息
	 * 		     情况有二： 1 如果使用 session.get() 获取数据 则session关闭后不能获取关联实体的信息 但能获取本身实体信息
	 *                    2 如果使用 session.load()获取数据 则session关闭后不但不能获取本身信息更不能获取关联实体的信息
	 *                   
	 * lazy=false 表示session关闭后能够获取关联实体的信息
	 * 
	 * 
	 * 测试  
	 * 
	 * 获取：是指获取对象
	 * 
	 * 一 使用session.get()方式时：
	 * 
	 * 1 lazy=true         session关闭前   session关闭后
	 *                 本身      获取        获取            
	 *  	     关联实体(对象)    获取       不能获取  
	 *  	 	
	 * 2 设置 lazy=false
	 * 	                     session关闭前   session关闭后
	 *                 本身      获取          获取            
	 *  	     关联实体(对象)    获取         获取  
	 * 
	 */
	public static void testLazyWhenSesssionGet(){
		
		Session session=new Configuration().configure("hibernate.cfg3.xml").buildSessionFactory().openSession();
	
		@SuppressWarnings("unused")
		Order order=(Order)session.get(Order.class, (long)1);
		//System.out.println(order.getOrderNumber());
		
		session.close();
		//System.out.println(order.getOrderNumber());
		
		//System.out.println(order.getCustomer().getName());
		
	}
	
	/**
	 * 2 lazy load()
	 * 
	 * 测试  lazy=true or false  load()
	 * 
	 * 二 使用session.load()方式时：
	 *  
	 *  获取：主要是指session关闭后,获取对象 
	 *       但要注意若在session关闭前访问get()或load()所获取的对象
	 *       此时或加载关联对象
	 *       
	 *       
	 *  
	 * 1 lazy=true         session关闭前   session关闭后
	 *                 本身      获取                     不获取            
	 *  	     关联实体(对象)   获取                  不获取  
	 *  	 	
	 * 2 设置 lazy=false
	 * 	                     session关闭前   session关闭后
	 *                 本身      获取          获取            
	 *  	     关联实体(对象)    获取          获取       
	 * 		
	 * 总结: 
	 *     针对的是lazy=true 且session关闭前均不访问获取对象
	 *     get() load() 异同： get()指加载本身 load() 均不加载
	 *     否则全(本身/关联) 加载等同于 lazy=false; 
	 * 		
	 */
	public static void testLazyWhenSessionLoad(){
		
		Session session=new Configuration().configure("hibernate.cfg3.xml").buildSessionFactory().openSession();
		@SuppressWarnings("unused")
		Order order=(Order)session.load(Order.class,(long)1);
		
		//System.out.println(order.getOrderNumber());
		
		session.close();
		
		//System.out.println(order.getOrderNumber());
		//System.out.println(order.getCustomer().getId());
		
	}
	
	
	
	
	/**
	 *   cascade=all、save-update、delete、none 级联
	 *   
	 */
	public static void testCascade(){
		 
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		//testLazyWhenSesssionGet();
		
		//testLazyWhenSessionLoad();
		
	}
}
