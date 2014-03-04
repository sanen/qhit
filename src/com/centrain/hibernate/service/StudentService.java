package com.centrain.hibernate.service;

import java.util.List;

import com.centrain.hibernate.model.Student;
//ѧ��ɼ���
public interface StudentService {

	
	public int insert(Student student);
	
	public void delete(int id);
	
	public int update(Student student);
	
	public Student selectByid(int id);
	
	public List<Student> selectAll(String entity);
}
