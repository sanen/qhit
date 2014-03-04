package com.centrain.spring.dao.eighteen.impl.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.centrain.hibernate.model.eighteen.Student;
import com.centrain.spring.dao.eighteen.StudentDAO;
import com.centrain.spring.dao.eighteen.impl.StudentDAOHibImpl;

public class TestStudent {

	/** 1 尽量不用
	 * hibernate 纳入IOC管理
	 * 方式一 此方式即将hibernate.cfg.xml中所有的信息纳入IOC管理
	 * beans0.xml  使用HibernateTemplate 和HibernateDaoSupport
	 */
	public static void test1(){
	
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans0.xml");
		StudentDAOHibImpl test=(StudentDAOHibImpl)ac.getBean("studentdao");
		Student student=new Student();
		student.setAge(20); 
		student.setName("zhangsan");
		test.save(student);
	} 
	
	/** 2 常用
	 * hibernate 纳入IOC管理
	 * 方式二 无需加载任何hibernate.cfg.xml 配置 需配置事务管理器使用Spring1.x事务
	 *  beans1.xml   使用SessionFactory  调用getCurrentSession()进行操作
	 */
	public static void test2(){
		 
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans1.xml");
		StudentDAO test=(StudentDAO)ac.getBean("baseTxService");
		Student student=new Student(); 
		student.setAge(20);
		student.setName("wangwu");
		test.save(student);
	}
	
	/** 3 最常用
	 * hibernate 纳入IOC管理
	 * 方式二 无需加载任何hibernate.cfg.xml 配置 需配置事务管理器使用Spring2.x事务
	 * beans2.xml  使用SessionFactory  调用getCurrentSession()进行操作
	 */
	public static void test3(){
		 
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans2.xml");
		StudentDAO test=(StudentDAO)ac.getBean("studentdao3");
		Student student=new Student(); 
		student.setAge(21);
		student.setName("chaoliu");
		test.save(student);
	}
	 
	/**
	 * 查询 事务管理机制  spring2.x 事务
	 */
	public static void testGetQuery(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans2.xml");
		StudentDAO test=(StudentDAO)ac.getBean("studentdao3"); 
		List<Student> list=test.query();
		for(Student student:list){
			System.out.println("编号"+student.getId()+"姓名"+student.getName());
		}
	} 
	/**
	 * 查询 事务管理机制  spring1.x 事务
	 */
	public static void testGetQuery1(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans1.xml");
		StudentDAO test=(StudentDAO)ac.getBean("baseTxService"); 
		List<Student> list=test.query();
		for(Student student:list){
			System.out.println("编号"+student.getId()+"姓名"+student.getName());
		}
	} 
	/**
	 * 测试更新 　
	 */
	public static void testUpdate(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans2.xml");
		@SuppressWarnings("unused")
		StudentDAO test=(StudentDAO)ac.getBean("studentdao3"); 
	}
	public static void main(String[] args) {
 
		//test1(); //ok
		//test2(); //ok
		//test3(); //ok
		
		//testGetQuery();//ok  spring2.x 事务
		testGetQuery1();//spring1.x
	}
	
}
