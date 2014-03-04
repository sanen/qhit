package com.centrain.struts.action.studentexam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.centrain.hibernate.model.studentexam.Users;
import com.centrain.hibernate.service.studentexam.UsersService;
import com.centrain.hibernate.service.studentexam.impl.UsersServiceImpl;
import com.centrain.struts.form.studentexam.Password;
import com.centrain.struts.form.studentexam.UsersForm;


public class PasswordAction extends DispatchAction {

	/** 3
	 * @param users
	 * @return true  
	 */
	public ActionForward updatePassword(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
	
		response.setContentType("text/html;charset=UTF-8");
		System.out.println("*****updatepassword***");
		
		UsersService usersService=new UsersServiceImpl();
		
		UsersForm usersForm=(UsersForm)form;
		
		Users users=(Users)request.getSession().getAttribute("usersLogin");
		Password password=usersForm.getPassword();
		
		String newpassword=password.getNewpassword();
		System.out.println("newpassword="+newpassword);
		 
		users.setPassword(newpassword);
		 
		if(usersService.updatePassword(users)){
			response.getWriter().println("<body bgcolor='pink'><center>�����޸ĳɹ�������󣬽����ز���ҳ��</center></body>");
			response.setHeader("refresh","3;url=userfunctionlist.jsp");
		}else{
			response.getWriter().println("<body bgcolor='pink'><center>�����޸ĳɹ�������󣬽������޸�����ҳ��</center></body>");
			response.setHeader("refresh","3;url=updatepassword.jsp");
		}
		return null;
	}

	
	

}
