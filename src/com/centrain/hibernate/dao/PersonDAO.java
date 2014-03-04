package com.centrain.hibernate.dao;

import java.util.List;

import com.centrain.hibernate.model.Person;
//person 登录用户表
public interface PersonDAO {

	public int insert(Person person);
	
	public int update(Person person);
	
	public int delete(int id);
	
	public List<Person> getQuery();
	
	public Person getPersonById(int id);
	
	public void delete(int ids[]);
	
	/**
	 * ��ѯ���û�����ͬ���û���¼
	 * 
	 */
	public boolean selectByUsername(String username);
	
}
  