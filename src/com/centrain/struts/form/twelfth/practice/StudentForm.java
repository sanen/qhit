package com.centrain.struts.form.twelfth.practice;


import org.apache.struts.action.ActionForm;


import com.centrain.hibernate.model.twelfth.practice.Score;
import com.centrain.hibernate.model.twelfth.practice.Student;

@SuppressWarnings("serial")

public class StudentForm extends ActionForm {
	
	private Student student=new Student();
	private Score score=new Score();
	
//	@Override
//	public void reset(ActionMapping mapping, HttpServletRequest request) {
//		student=new Student();
//		score=new Score();
//	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
}
