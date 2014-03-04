package com.centrain.struts.action.studentexam;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.centrain.hibernate.model.studentexam.Users;
import com.centrain.hibernate.service.studentexam.UsersService;
import com.centrain.hibernate.service.studentexam.impl.UsersServiceImpl;
import com.centrain.struts.form.studentexam.UsersForm;

public class UsersAction extends DispatchAction {

	UsersService usersService=new UsersServiceImpl();
	
	/** 1
	 * ����û�  ע��
	 * @param users
	 * @return
	 */
	public ActionForward addUsers(ActionMapping mapping, ActionForm form,
			HttpServletRequest arg2, HttpServletResponse arg3) throws Exception {
		System.out.println("addUsers");
		
		arg3.setContentType("text/html;charset=UTF-8");
		UsersForm usersForm=(UsersForm)form;
		Users users=usersForm.getUsers();
		
		//true ��ӳɹ���֮ʧ��
		if(usersService.addUsers(users)){
			arg3.getWriter().println("<body bgcolor='pink'><center>�û�ע��ɹ���}��󣬽��Զ���ά��������Ϣҳ��</center></body>");
			arg3.setHeader("refresh","2;url=index.jsp"); 
			arg3.getWriter().close();
		}else{
			arg3.getWriter().println("<body bgcolor='pink'><center><p style='color:pink'>�û�ע��ʧ��,�Ѵ��ڴ��û�����û�,������ע��!���Զ����¼ҳ��,</p></center></body>");
			arg3.setHeader("refresh","2;url=index.jsp");
			arg3.getWriter().close();
		}
		return null;
	}
	
	/** 2
	 * ɾ����û�
	 * @param id
	 * @return
	 */
	public ActionForward deleteUsers(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse arg3) throws Exception {
		System.out.println("deleteUsers");
		arg3.setContentType("text/html;charset=UTF-8");
		UsersForm usersForm=(UsersForm)form;
		
		int id=usersForm.getUsers().getId();
		
		if(usersService.deleteUsers(id)){//true ɾ��ɹ� ��֮ʧ��
			arg3.getWriter().println("<body bgcolor='pink'><center>ɾ��ɹ�������󣬽��Զ���ת������ҳ��</center></body>");
			return getALlUsers(mapping, form, request, arg3);
		}else{
			arg3.getWriter().println("<body bgcolor='pink'><center><p style='color:pink'>ɾ��ʧ��!���Զ���ά��������Ϣҳ��</p></center></body >");
		}	
		return getALlUsers(mapping, form, request, arg3);
	}
	
	/** 3  PasswordAction.do �� updatePassword()����
	 * �޸��û�����
	 * @param users
	 * @return true �޸ĳɹ���֮ʧ��
	 */

	/** 4
	 * ��ȡ���е��û���Ϣ
	 * @return
	 */	
	public ActionForward getALlUsers(ActionMapping mapping, ActionForm arg1,
			HttpServletRequest request, HttpServletResponse arg3) throws Exception {
		System.out.println("getALlUsers");
		
		arg3.setHeader("pragma", "no-cache");
		arg3.setHeader("cache-control", "no-cache");
		arg3.setHeader("expires", "0");
		
		List<Users>  list=usersService.getALlUsers();
		request.getSession().setAttribute("userslist", list);
		return mapping.findForward("managerUser");
	}

	/** 5
	 * �����ͬ�û�����û��Ƿ����
	 * @param username
	 * @return
	 */
	public ActionForward checkUsersExist(ActionMapping arg0, ActionForm form,
			HttpServletRequest arg2, HttpServletResponse arg3) throws Exception {
		System.out.println("checkUsersExist");
		
		UsersForm usersForm=(UsersForm)form;
		
		String username=usersForm.getUsers().getUsername();
		usersService.checkUsersExist(username);
		
		return null;
	} 

	/** 6
	 * �û���¼
	 * null ���Ϸ���¼ �򷵻ص�¼ҳ��  ��֮������Ӧ������û�����ҳ��
	 * users.getIsmanager()=0 �Ϸ���¼ �����
	 * users.getIsmanager()=1 �Ϸ���¼ ����Ա����
	 */
	public ActionForward userLogin(ActionMapping mapping, ActionForm form,
			HttpServletRequest arg2, HttpServletResponse arg3) throws Exception {
		System.out.println("userLogin");
		
		UsersForm usersForm=(UsersForm)form;
		
		Users users=usersForm.getUsers();
		
		Users user=usersService.userLogin(users);
		HttpSession session=arg2.getSession();
		// user!=null ֤���ǺϷ���¼�û� ��֮ ���Ϸ� 
		if(user!=null){
			session.setAttribute("usersLogin", user);
			session.setAttribute("ismanager", user.getIsmanager());
			//)չ��
			//if(user.getIsmanager()==0){//==0 ����
				
			//}else if(user.getIsmanager()==1){ //==1 ����Ա
				
			//}
			
			return mapping.findForward("userfunctionlist");
		}
		
		return mapping.findForward("index");
	}
	
	/** 7
	 * ��ȡ�����û�����Ϣ
	 */
	public ActionForward getUserById(ActionMapping mapping, ActionForm form,
			HttpServletRequest arg2, HttpServletResponse arg3) throws Exception {
		System.out.println("getUserById");
		
		UsersForm usersForm=(UsersForm)form;
		Users user=usersForm.getUsers();
		int id=user.getId();
		
		Users users=usersService.getUserById(id);
		arg2.setAttribute("users", users);
		
		return mapping.findForward("updatepassword");
	}
	
	/** 8
	 * �˳�ϵͳ
	 * @param mapping
	 * @param form
	 * @param arg2
	 * @param arg3
	 * @return
	 * @throws Exception
	 */
	
	public ActionForward quitSystem(ActionMapping mapping, ActionForm form,
			HttpServletRequest arg2, HttpServletResponse arg3) throws Exception {
		System.out.println("quit");
		arg2.getSession().setAttribute("usersLogin", null);
		return mapping.findForward("index"); 
	}
	
	
}
