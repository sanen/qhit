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

public class UserAction extends DispatchAction {

	private UserService service;  
	 
 
	public void setService(UserService service) {
		this.service = service;
	}

	/**
	 * 1 添加用户
	 * @param user
	 * @return
	 */
	public ActionForward addUser(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=UTF-8");
		System.out.println("addUser"); 
		UserForm userForm=(UserForm)form;
		User user=userForm.getUser();
		 
		if(service.addUser(user)){
			//用户添加成功
			response.getWriter().println("<body bgcolor='ADEI' align='center'>用户添加成功,两秒后系统会自动跳转到用户信息页面</body>");
			return getUsers(mapping, form, request, response); 
		}else{
			response.getWriter().println("<body bgcolor='ADEI' align='center'>用户添加失败,两秒后系统会自动跳转到添加用户信息页面</body>");
			return mapping.findForward("insertUser"); 
		}   
	}
	
	/**
	 * 2 删除用户 
	 * @param id
	 * @return
	 */
	public ActionForward deleteUser(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		System.out.println("deleteUser");
		UserForm userForm=(UserForm)form;
		User user=userForm.getUser();
		int id=user.getId();
		if(service.deleteUser(id)){
			//删除成功
			 
		}else{
			//删除失败
			
		}
		return getUsers(mapping, form, request, response);
	}


	
	/**
	 * 4 获取单个用户
	 * @param id
	 * @return
	 */
	public ActionForward getUserById(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("getUserById");
		UserForm userForm=(UserForm)form;
		User user=userForm.getUser();
		int id=user.getId();
		User users=service.getUserById(id);
		request.setAttribute("user", users);
		return mapping.findForward("updateUser");  
	}

	/**
	 * 5获取所有用户信息
	 * @return
	 */
	public ActionForward getUsers(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		System.out.println("getUsers");
		request.setAttribute("users",service.getUsers());
		return mapping.findForward("userlist");  
	}
	
	
	/**
	 * 6 分页获取所有用户信息 
	 * @param pageid
	 * @param pagesize 
	 * @return
	 */
	public ActionForward getUsersByFenYe(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("getUsersByFenYe");
		 
		
		return null;
	}
	
}
