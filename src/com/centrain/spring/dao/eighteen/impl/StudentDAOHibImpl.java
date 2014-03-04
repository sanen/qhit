package com.centrain.spring.dao.eighteen.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


import com.centrain.hibernate.model.eighteen.Student;
import com.centrain.spring.dao.eighteen.StudentDAO;
/**
 * Spring 对HIbernate DAO 的Ioc管理
 */
public class StudentDAOHibImpl extends HibernateDaoSupport implements StudentDAO {

	HibernateTemplate ht=null; 
	 
	public void init(){
		ht=super.getHibernateTemplate();
	} 
	
	public void del(int id) {
		
	}

	public Student get(int id) {
		return null;
	}

	public List<Student> query() {
		return null;
	}

	public void save(Student stu) {
		ht.save(stu);
	}

	public void update(Student stu) {

	}

}
