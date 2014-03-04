package com.centrain.ssh.web.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
 
import com.centrain.ssh.orm.User;
import com.centrain.ssh.service.UserService;
import com.centrain.ssh.web.struts.from.UserForm;

public class UpdateUserAction extends DispatchAction {

	private UserService service;  
	 
	public void setService(UserService service) {
		this.service = service;
	}

	/**
	 * 3 修改用户
	 * @param user
	 * @return
	 */
	public ActionForward udpateUser(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		System.out.println("udpateUser");
		UserForm userForm=(UserForm)form; 
		User user=userForm.getUser();
		if(service.udpateUser(user)){
			//修改成功 
			response.getWriter().print("修改成功！");
			
		}else{
			//修改失败
			response.getWriter().print("修改失败！");
		}
		request.getRequestDispatcher("UserAction.do?method=getUsers").forward(request, response);
		response.getWriter().close();
		return null; 
	}

}
