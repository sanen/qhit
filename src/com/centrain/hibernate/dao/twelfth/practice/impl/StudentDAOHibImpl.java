package com.centrain.hibernate.dao.twelfth.practice.impl;



import java.util.List;


import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.centrain.hibernate.dao.impl.BaseDAO;
import com.centrain.hibernate.dao.twelfth.practice.StudentDAO;

import com.centrain.hibernate.model.twelfth.practice.Student;

public class StudentDAOHibImpl extends BaseDAO implements StudentDAO {

	String hibernateCfgName="hibernate.cfg7.xml";
	/**
	 * ���ѧԱ
	 * @param student
	 */
	public boolean addStudent(Student student) {
	
		return super.insertBoolean(student, hibernateCfgName);
		
	}


	
	

	
	/**
	 * ���Ҫ�޸ĵ�ѧԱ��Ϣ ��(���� ���� �Լ���Ӧ�ĳɼ�
	 * @param sid
	 * @return
	 */
	public Student getStudentById(Integer id) {
		
		//���Ҫ��ѯ��ѧԱ����Ϣ
		Student	student=(Student)super.get(Student.class, id, hibernateCfgName);
		
		return student;
	}

	
	
	 
	 
	/**
	 * 
	 * �������ѧԱ������
	 * @return
	 */ 
	@SuppressWarnings("unchecked")
	public List<Object[]> getAllStudentNames() {
		
		List<Object[]> list=null;
		
		Session session=new Configuration().configure("hibernate.cfg7.xml").buildSessionFactory().openSession();
		Transaction tx=null;
		
		try {
			tx=session.beginTransaction();
			String hql="select stu.sid,stu.sname from Student stu";
			
			Query query=session.createQuery(hql);
			
			list=query.list();
			
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		} 
		return list;
		
	}

	public boolean deleteStudent(Integer student_id) {
       
		return  super.deleteBoolean(Student.class, student_id, hibernateCfgName);
	}
	
	

	public boolean updateStudent(Student student) {
		
		//new Configuration()��ȡ 1 hibernate.properties 2 configure() ��ȡhibernate.cfg.xml �ļ�
		return super.updateBoolean(student, hibernateCfgName);

	}



	@SuppressWarnings("unchecked")
	public List<Student> getQuery() {
		
		List<Student> list=(List<Student>) super.getAll("Student", hibernateCfgName);
				
		return list;
	} 
	
	
}
