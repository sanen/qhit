package com.centrain.struts.form.studentexam;

import org.apache.struts.action.ActionForm;

import com.centrain.hibernate.model.studentexam.SubjectType;



/**
 * 
 * ���Կ�Ŀ��� ActionForm 
 * @author zhangkehua
 *
 */
@SuppressWarnings("serial")
public class SubjectTypeForm extends ActionForm {

	private SubjectType subjectType=new SubjectType();
	private String method;
	
	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public SubjectType getSubjectType() {
		return subjectType;
	}

	public void setSubjectType(SubjectType subjectType) {
		this.subjectType = subjectType;
	}
	
		
}
