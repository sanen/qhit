package com.centrain.spring.dao.eighteen;

import java.util.List;

import com.centrain.hibernate.model.eighteen.Student;

public interface StudentDAO {

	public void save(Student stu) ;
	public void del(int id) ;
	public void update(Student stu) ;
	public Student get(int id) ;
	public List<Student> query() ;
}
