package com.centrain.struts.form;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.centrain.hibernate.model.Person;


@SuppressWarnings("serial")
public class PersonForm extends ActionForm {

	private Person person=new Person();
	
	private int[] ids;
	
	private String operation;
	
	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
	
		ActionErrors errors=new ActionErrors(); 
		if(operation==null||operation.equals("")){
			
		}else if(operation.equals("insert")||operation.equals("update")){
			if((this.getPerson().getUsername().length()>10)||(this.getPerson().getPasswrod().length()>10)){
				
				ActionMessage error=new ActionMessage("用户名或密码过长不能进行修改或添加",false);
				errors.add("error.info", error);
				
			}
		}
	
		
		return errors;
	}

	public int[] getIds() {
		return ids;
	}

	public void setIds(int[] ids) {
		this.ids = ids;
	}
	
	
}
