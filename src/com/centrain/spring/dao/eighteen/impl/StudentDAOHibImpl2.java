package com.centrain.spring.dao.eighteen.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.centrain.hibernate.model.eighteen.Student;
import com.centrain.spring.dao.eighteen.StudentDAO;

/**
 * Spring 对HIbernate DAO 的Ioc管理
 * 使用Spring 事务管理机制 1.x 或 2.x
 * beans1.xml 1.x
 * beans2.xml 2.x
 */
public class StudentDAOHibImpl2 implements StudentDAO {

	private SessionFactory sessionFactory ;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	} 

	public void del(int id) {
		sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().get(Student.class, id));
	}  

	public Student get(int id) {
		return (Student)sessionFactory.getCurrentSession().get(Student.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Student> query() {
		return (List<Student>)sessionFactory.getCurrentSession().createQuery("from Student").list();
	}
	 
	//重点sessionFactory.getCurrentSession()
	public void save(Student stu) {
		sessionFactory.getCurrentSession().save(stu); 
	}

	public void update(Student stu) {
		sessionFactory.getCurrentSession().update(stu);
	}

}
