package com.centrain.hibernate.service.impl;

import java.util.List;

import com.centrain.hibernate.dao.StudentDao;
import com.centrain.hibernate.dao.impl.StudentDaoHibImpl;
import com.centrain.hibernate.model.Student;
import com.centrain.hibernate.service.StudentService;
//ѧ��ɼ���
public class StudentServiceImpl implements StudentService{
 
	private StudentDao studentDao=new StudentDaoHibImpl();
	
	public void delete(int id) {
		studentDao.delete(id);
	}

	public int insert(Student student) {
		int result=studentDao.insert(student);
		return result;
	}

	public List<Student> selectAll(String entity) {
		List<Student> list=studentDao.selectAll("Student");
		return list;
	}

	public Student selectByid(int id) {
		Student student=studentDao.selectByid(id);
		return student;
	}

	public int update(Student student) {
		int result=studentDao.update(student);
		return result;
	}
	
	public static void main(String[] args) {
//		StudentServiceImpl test=new StudentServiceImpl();
//		Student student=new Student();
//		student.setId(1);
//		student.setClassName("T04");
//		student.setChineseMarks(80);
//		student.setEnglishMarks(75);
//		student.setMathMarks(95);
//		student.setStudentName("����");
//		test.update(student);
		
//		student.setTotalMarks(80+75+95);
//		int i=test.insert(student);
//		System.out.println("i="+i);
//		test.delete(1);
	}

}
