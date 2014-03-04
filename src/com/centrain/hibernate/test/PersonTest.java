package com.centrain.hibernate.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.criterion.Projections;


import com.centrain.hibernate.HibernateSessionFactory;
import com.centrain.hibernate.dao.impl.PersonDaoHibImpl;
import com.centrain.hibernate.model.Person;
import com.centrain.hibernate.model.Student;


public class PersonTest {

	
	static PersonDaoHibImpl persondao=new PersonDaoHibImpl();
	
	public static void getAllFenye(){
		//分页显示用户信息
		List<Person> list=persondao.getAllFenYe(1, 8);
		for(Person p:list){
			System.out.println(p.getId()+":"+p.getUsername());
		}
		
	}
	
	public static void deletePersons(){
		//批量删除
		int ids[]={13,14,15};
		persondao.delete(ids);
		
	}
	
	
	/*
	 * 删除单个用户
	 */
	
	public static void delete(){
		persondao.delete(3);
	}
	
	public static void person(){
		
		//批量删除
		//deletePersons();
		
		
		//分页显示用户信息
		getAllFenye();
		
	}
	
	@SuppressWarnings("unchecked")
	public static void selectByUsername(){
		
		Configuration cf=new Configuration().configure();
		SessionFactory sf=cf.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery("from Person as s "+" where s.username='aa'");
		
		@SuppressWarnings("unused")
		Query query2=(Query) query.uniqueResult();
		
		@SuppressWarnings("unused")
		List<Person> list=query.list();
		
		tx.commit();
		session.close();
		
		System.out.println(persondao.selectByUsername("aa"));
	}
	/**
	 * 使用 Criteria接口操作数据
	 * 总条数
	 * 
	 */
	@SuppressWarnings("unchecked")
	public static void testCriteria1(){
		Session session=HibernateSessionFactory.getSession();
		List list=session.createCriteria(Student.class).setProjection(Projections.projectionList().add(Projections.rowCount())).list();
		for (int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}
		session.close();
	}
	/**
	 * 英语最高分
	 */
	@SuppressWarnings("unchecked")
	public static void testCriteria2(){
		Session session=HibernateSessionFactory.getSession();
		List list=session.createCriteria(Student.class)
			   .setProjection(Projections.projectionList()
					         .add(Projections.max("englishMarks"))).list();
		
		for (int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}
		session.close();
		
	}
	
	
	public static void main(String[] args) {
//		person();
//		selectByUsername();
		
//		select *from student where  englishMarks in
//		(
//		select Max(englishMarks) from student
//		)
		
//		testCriteria1();
		
		
		
	}
}
