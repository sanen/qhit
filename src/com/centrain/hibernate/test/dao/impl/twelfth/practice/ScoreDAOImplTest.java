package com.centrain.hibernate.test.dao.impl.twelfth.practice;


import com.centrain.hibernate.dao.twelfth.practice.impl.ScoreDAOHibImpl;
import com.centrain.hibernate.model.twelfth.practice.Score;
import com.centrain.hibernate.model.twelfth.practice.Student;

public class ScoreDAOImplTest {

	/**
	 * ≤‚ ‘∑Ω∑®
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		ScoreDAOHibImpl s=new ScoreDAOHibImpl();
		
		Score score=new Score();
		score.setShuxue(81);
		score.setYewen(81);
		Student student=new Student();
		student.setSage(21);
		student.setSname("list");
		score.setStudent(student);
		
		s.addScore(score);
		
	}
}
