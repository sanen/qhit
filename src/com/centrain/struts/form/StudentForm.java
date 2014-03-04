package com.centrain.struts.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.centrain.hibernate.model.Student;

public class StudentForm extends ActionForm{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2928981197338776177L;
	
	private Student student=new Student();

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		
		
		return super.validate(mapping, request);
	}
	
	

	
}
