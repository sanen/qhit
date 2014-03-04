package com.centrain.ssh.web.struts.from;
		 
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
 
import com.centrain.ssh.orm.User;

@SuppressWarnings("serial")
public class UserForm extends ActionForm {
	
	private User user=new User();
	private String method;//锟斤拷锟斤拷锟街�
	
	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public User getUser() {
		return user;
	} 

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors error=new ActionErrors();
		if(method.equals("addUser")||method.equals("udpateUser")){
			if(user.getUsername()==null||"".equals(user.getUsername())){
				ActionMessage message=new ActionMessage("用户名不能为空！",false);
				error.add("error.username",message);
			}  
			if(user.getAge()==0||"".equals(user.getAge())||user.getAge()>120){
				ActionMessage message=new ActionMessage("年龄有误请重新填写！",false);
				error.add("error.age",message);
			} 
			if(user.getPassword()==null||"".equals(user.getPassword())){
				ActionMessage message=new ActionMessage("密码不能为空!",false);
				error.add("error.password",message);
			} 
			if(user.getPassword().length()<6){
				ActionMessage message=new ActionMessage("密码长度不够!",false);
				error.add("error.passwordLength",message); 
			}
			if(user.getEmail()==null||"".equals(user.getEmail())){
				ActionMessage message=new ActionMessage("邮箱不能为空！",false);
				error.add("error.email",message);
			}  
		}
		return error;
	}
	
	
	
}
