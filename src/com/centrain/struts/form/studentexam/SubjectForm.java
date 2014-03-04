package com.centrain.struts.form.studentexam;

import org.apache.struts.action.ActionForm;

import com.centrain.hibernate.model.studentexam.Subject;

/**
 * 考试科目 ActionForm
 * @author zhangkehua
 *
 * Mar 3, 2013
 */
@SuppressWarnings("serial")
public class SubjectForm extends ActionForm{

	private Subject subject=new Subject();//考试科目实体对象
	private String method;//操作考试科目的标志
	
	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	
	
}
