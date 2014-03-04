package com.centrain.struts.form.studentexam;

import java.io.Serializable;
@SuppressWarnings("serial")
public class Password implements Serializable {

	private String newpassword;//������
	private String repeatnewpassword;//�ظ�������
	
	public String getNewpassword() {
		return newpassword;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	public String getRepeatnewpassword() {
		return repeatnewpassword;
	}
	public void setRepeatnewpassword(String repeatnewpassword) {
		this.repeatnewpassword = repeatnewpassword;
	}
	
	
}
