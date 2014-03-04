package com.centrain.hibernate.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.centrain.hibernate.dao.PersonDAO;
import com.centrain.hibernate.model.Person;
//登录用户表
public class PersonDaoHibImpl extends BaseDAO implements PersonDAO {

	public int delete(int id) {
		int result=super.delete(Person.class, id);
		return result;
	}

	public Person getPersonById(int id) {
		Person person=(Person)super.get(Person.class, id);
		return person;
	}

	@SuppressWarnings("unchecked")
	public List<Person> getQuery() {
		List<Person> list=(List<Person>) super.getAll("Person");
		return list;
	}

	public int insert(Person person) {
		//if back false also is ֤�� ���û��Ѳ�����
		int result=0;
		if(!selectByUsername(person.getUsername())){
			result=super.insert(person);
		}
		
		
		return result;
	}

	public int update(Person person) {
		int result=super.update(person);
		return result;
	}

	/**
	 * ��ɾ�����
	 */
	public void delete(int[] ids) {
		
		for (int i = 0; i < ids.length; i++) {
			super.delete(Person.class, ids[i]);
		}
		
	}

	/**
	 *��ҳ��ȡ��ѯ���
	 */
	@SuppressWarnings("unchecked")
	public List<Person> getAllFenYe(int pageid,int pagesize){
		List<Person> list=(List<Person>) super.getAllByFenYe("Person", pageid, pagesize);
		return list;
	}
	
	
	/**
	 * ��ѯ���Ƿ������ͬ�û�����û�
	 * 
	 */
	@SuppressWarnings("unchecked")
	public boolean selectByUsername(String username) {
	
		Configuration cf=new Configuration().configure();
		SessionFactory sf=cf.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
//		Query query=session.createQuery("from Person as s "+" where s.username='"+username+"'");
		Query query=session.createQuery("from Person as s "+" where s.username='"+username+"'");
		
		List<Person> list=query.list();
		
		if(list.size()>0){
			return true;
		}
		tx.commit();
		session.close();
		
		
		return false;
	}
	
	
}
