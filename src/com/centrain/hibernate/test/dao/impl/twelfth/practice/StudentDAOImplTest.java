package com.centrain.hibernate.test.dao.impl.twelfth.practice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.centrain.hibernate.dao.twelfth.practice.StudentDAO;
import com.centrain.hibernate.dao.twelfth.practice.impl.StudentDAOHibImpl;
import com.centrain.hibernate.model.twelfth.practice.Score;
import com.centrain.hibernate.model.twelfth.practice.Student;
import com.centrain.hibernate.service.twelfth.practice.impl.StudentServiceImpl;

public class StudentDAOImplTest implements StudentDAO{

	  static StudentDAOHibImpl s=new StudentDAOHibImpl();
		
	   /**
		 * 锟斤拷锟皆凤拷锟斤拷
		 * @param args
		 */
		public static void main(String[] args) {
			
			StudentServiceImpl test=new StudentServiceImpl();
			
			
		
			//锟斤拷锟�
			Student student=new Student();
			student.setSage(20);
			student.setSname("wangwu");
			
			Set<Score> set=new HashSet<Score>();
			
			Score score=new Score();
			
			score.setShuxue(70);
			score.setYewen(70);
			
			set.add(score);
			
			student.setScore(set);
			
			
			test.addStudent(student);
		}
		
		

		public boolean addStudent(Student student) {
			return s.addStudent(student);
		}

		public boolean deleteStudent(Integer student_id) {
			
			return s.deleteStudent(student_id);
		}

		public List<Object[]> getAllStudentNames() {
			return s.getAllStudentNames();
		}

		public List<Student> getQuery() {
			return s.getQuery();
		}

		public Student getStudentById(Integer id) {
			return s.getStudentById(id);
		}

		public boolean updateStudent(Student student) {
			return s.updateStudent(student);
		}
		
	
}
