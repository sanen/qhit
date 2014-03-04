package com.centrain.hibernate.service;

import java.util.List;

import com.centrain.hibernate.model.Person;
//��¼�û���
public interface PersonService {

	public int insert(Person person);
	
	public int update(Person person);
	
	public int delete(int id);
	
	public List<Person> getQuery();
	
	public Person getPersonById(int id);
	
	public void delete(int ids[]);
}
