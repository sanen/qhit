package com.centrain.hibernate.service.impl;

import java.util.List;

import com.centrain.hibernate.dao.PersonDAO;
import com.centrain.hibernate.dao.impl.PersonDaoHibImpl;
import com.centrain.hibernate.model.Person;
import com.centrain.hibernate.service.PersonService;
//��¼�û���
public class PersonServiceImpl implements PersonService {

	private PersonDAO personDAO=new PersonDaoHibImpl();
	
	public int delete(int id) {
		int result=personDAO.delete(id);
		return result;
	}

	public Person getPersonById(int id) {
		Person person=personDAO.getPersonById(id);
		return person;
	}

	public List<Person> getQuery() {
		List<Person> list=personDAO.getQuery();
		return list;
	}

	public int insert(Person person) {
		int result=personDAO.insert(person);
		return result;
	}

	public int update(Person person) {
		int result=personDAO.update(person);
		return result;
	}
	
	public static void main(String[] args) {
		
//		PersonServiceImpl ps=new PersonServiceImpl();
//		Person person=new Person();
//		person.setId(3);
//		person.setPasswrod("bbb");
//		person.setUsername("aaa");
//		System.out.println(ps.delete(3));
//		System.out.println(ps.update(person));
//		System.out.println(ps.getQuery().size());
		
	}

	public void delete(int[] ids) {
		personDAO.delete(ids);
	}

}
