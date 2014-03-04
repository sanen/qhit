package com.centrain.hibernate.test.model.twelfth.practice;



import java.util.HashSet;
import java.util.Set;

import com.centrain.hibernate.dao.impl.BaseDAO;
import com.centrain.hibernate.model.twelfth.practice.Score;
import com.centrain.hibernate.model.twelfth.practice.Student;
import com.centrain.hibernate.service.twelfth.practice.StudentService;
import com.centrain.hibernate.service.twelfth.practice.impl.StudentServiceImpl;

public class TestPractice extends BaseDAO{

	public  Student test(String sname,Integer sage,Integer shuxue,Integer yewen){
		Score score=new Score();
		
		Student student=new Student();
		
		student.setSage(sage);
		student.setSname(sname);
		
		
		Set<Score> set=new HashSet<Score>();
		set.add(score);
		student.setScore(set);
		score.setShuxue(shuxue);
		score.setYewen(yewen);
		
		score.setStudent(student);
		
		return student;
	}
	
	public static void main(String[] args) {
		
		StudentService studentService=new StudentServiceImpl();
		
		TestPractice test=new TestPractice();
		
		//���ѧԱ ����Ϣ ��ѧԱ�ɼ�
		studentService.addStudent(test.test("aaaa",21,85,91));
				
		//��ѯѧԱ��Ϣ ��( ����Ϣ(����,����) ��ѧԱ�ɼ�
		
//		Student student=studentService.getUpdateStudent(1);
//		
//		System.out.println(student.getSage());
//		
//		Set<Score> set=student.getScore();
//		
//		for(Score score:set){
//			System.out.println("��ѧ="+score.getShuxue());
//		}
		
		//��ѯ������ѧԱ������
		
		
//		test.testAddStudentToAddThisScore();
	}
}
