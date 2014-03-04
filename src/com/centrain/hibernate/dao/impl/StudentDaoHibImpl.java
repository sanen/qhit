package com.centrain.hibernate.dao.impl;

import java.util.List;

import com.centrain.hibernate.dao.StudentDao;
import com.centrain.hibernate.model.Student;
//学生成绩表

public class StudentDaoHibImpl extends BaseDAO implements StudentDao{

	 static StudentDaoHibImpl studao=new StudentDaoHibImpl();
	
	public void delete(int id) {
		super.delete(Student.class, id);
	}
	
	public int insert(Student student) {
		int i=super.insert(student);
		return i;
	}

	@SuppressWarnings("unchecked")
	public List<Student> selectAll(String entity) {
		List<Student> list=(List<Student>) super.getAll("Student");
		return list;
	}

	public Student selectByid(int id) {
		Student student=(Student) super.get(Student.class, id);		
		return student;
	}

	public int update(Student student) {
		int result=super.update(student);
		System.out.println("result="+result);
		return result;
	}


}
