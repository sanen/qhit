package com.centrain.hibernate.test;

import com.centrain.hibernate.dao.StudentDao;
import com.centrain.hibernate.dao.impl.StudentDaoHibImpl;

public class StudentTest {

	 static StudentDao studao=new StudentDaoHibImpl();
	 
	 public static void student(){
		
		//查询单个学员信息
//		Student student=studao.selectByid(1);
//		System.out.println(student.getId()+":"+student.getChineseMarks());
		
		//添加学员
//	    Student student=new Student();
//		
//		student.setChineseMarks(89);
//		student.setClassName("T1");
//		student.setEnglishMarks(88);
//		student.setMathMarks(105);
//		student.setStudentName("zhangsan");
//		System.out.println(studao.insert(student));
	 }
	 
	 public static void main(String[] args) {
		student();
	}
}
