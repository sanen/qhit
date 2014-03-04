package com.centrain.hibernate.service.twelfth.practice.impl;

import java.util.List;

import com.centrain.hibernate.dao.twelfth.practice.StudentDAO;
import com.centrain.hibernate.dao.twelfth.practice.impl.StudentDAOHibImpl;
import com.centrain.hibernate.model.twelfth.practice.Student;
import com.centrain.hibernate.service.twelfth.practice.StudentService;

public class StudentServiceImpl implements StudentService {

	StudentDAO studentDAO=new StudentDAOHibImpl();
	
	public boolean addStudent(Student student) {
		       
		return studentDAO.addStudent(student);
	}

	
	public Student getStudentById(Integer sid) {
		
		return studentDAO.getStudentById(sid);
	}

	public List<Object[]> getAllStudentNames() {
		
		return studentDAO.getAllStudentNames();
	}

	public boolean deleteStudent(Integer student_id) {
		
		return studentDAO.deleteStudent(student_id);
	
	}

	public boolean updateStudent(Student student) {
		
		return studentDAO.updateStudent(student);
	}

	
	public List<Student> getQuery() {
		 
		return studentDAO.getQuery();
	}

//	public static void main(String[] args) {
//	    ɾ��
//		StudentServiceImpl s=new StudentServiceImpl();
//		s.deleteStudent(3);
//	}
}
