package com.centrain.struts.form.studentexam;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.centrain.hibernate.model.studentexam.Users;


 
@SuppressWarnings("serial")
public class UsersForm extends ActionForm{

	private Users users=new Users();
	
	private Password password=new Password();
	
	private String method;
	
	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors error=new ActionErrors();
		if(method.equals("addUsers")||method.equals("userLogin")){
			//System.out.println("-----------------");
			if(users.getUsername()==null||"".equals(users.getUsername())){
				ActionMessage messages=new ActionMessage("�û�����Ϊ��!",false);
				error.add("error.username",messages);
			}
			if(users.getPassword()==null||"".equals(users.getPassword())){
				ActionMessage messages=new ActionMessage("���벻��Ϊ��!",false);
				error.add("error.password",messages);
			}
		}else if(method.equals("updatePassword")){
			Users usersLogin=(Users)request.getSession().getAttribute("usersLogin");
			//System.out.println("sessionUser="+usersLogin.getPassword());
			if(users.getPassword()==null||"".equals(users.getPassword())){
				ActionMessage messages=new ActionMessage("�����벻��Ϊ��!",false);
				error.add("error.lastpassword",messages);
			} 
			if(!users.getPassword().equals(usersLogin.getPassword())){
				ActionMessage messages=new ActionMessage("�����벻��ȷ,����������!",false);
				error.add("error.notpassword",messages);
			}
			if(password.getNewpassword()==null||"".equals(password.getNewpassword())){
				ActionMessage messages=new ActionMessage("�����벻��Ϊ��!",false);
				error.add("error.newpassword",messages);
			}
			if(password.getRepeatnewpassword()==null||"".equals(password.getRepeatnewpassword())){
				ActionMessage messages=new ActionMessage("�ظ����벻��Ϊ��!",false);
				error.add("error.repeatnewpassword",messages);
			}
			if(!password.getNewpassword().equals(password.getRepeatnewpassword())){
				ActionMessage messages=new ActionMessage("�ظ����������������һ��!",false);
				error.add("error.updatepassword",messages);
			}
		}
		
		return error;
	}

	public Password getPassword() {
		return password;
	}

	public void setPassword(Password password) {
		this.password = password;
	}
	
	
}
