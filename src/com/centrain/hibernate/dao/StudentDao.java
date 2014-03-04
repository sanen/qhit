package com.centrain.hibernate.dao;

import java.util.List;

import com.centrain.hibernate.model.Student;
//学生成绩表
public interface StudentDao {

	public int insert(Student student);
	
	public void delete(int id);
	
	public int update(Student student);
	
	public Student selectByid(int id);
	
	public List<Student> selectAll(String entity);
}
