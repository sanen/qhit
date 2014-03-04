package com.centrain.struts.action.studentexam;

import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.centrain.hibernate.model.studentexam.Questions;
import com.centrain.hibernate.model.studentexam.Subject;
import com.centrain.hibernate.model.studentexam.Users;
import com.centrain.hibernate.service.studentexam.SubjectService;
import com.centrain.hibernate.service.studentexam.impl.SubjectServiceImpl;
import com.centrain.struts.form.studentexam.SubjectForm;


public class SubjectAction extends DispatchAction {

	SubjectService service=new SubjectServiceImpl();
	
	/** 1
	 * 缁欑浉搴旂殑绉戠洰绫诲埆娣诲姞鑰冭瘯绉戠洰
	 * @param subject
	 * @return
	 */
	public ActionForward addSubject(ActionMapping arg0, ActionForm form,
			HttpServletRequest arg2, HttpServletResponse arg3) throws Exception {
		System.out.println("addSubject");
		
		SubjectForm subjectForm=(SubjectForm)form;
		Subject subject=subjectForm.getSubject();
		
		//true 娣诲姞鑰冭瘯绉戠洰鎴愬姛
		if(service.addSubject(subject)){
		   
		}
		return null;
	}

	/** 2
	 * 妫�娴嬫绉戠洰绫诲埆鐨勮�冭瘯绉戠洰鏄惁瀛樺湪
	 * @param subject
	 * @return true 瀛樺湪  false涓嶅瓨鍦�
	 */
	public ActionForward checkSubjectExist(ActionMapping arg0, ActionForm form,
			HttpServletRequest arg2, HttpServletResponse arg3) throws Exception {
		System.out.println("checkSubjectExist");
		
		SubjectForm subjectForm=(SubjectForm)form;
		Subject subject=subjectForm.getSubject();
		
		//true 锟斤拷锟斤拷锟斤拷涌锟侥� 
		service.checkSubjectExist(subject);
		
		return null;
	}

	/** 3
	 * 鍒犻櫎鐩稿簲鐨勭鐩被鍒殑鑰冭瘯绉戠洰
	 * * @param id
	 * @return
	 */
	public ActionForward deleteSubject(ActionMapping arg0, ActionForm form,
			HttpServletRequest arg2, HttpServletResponse arg3) throws Exception {
		System.out.println("deleteSubject");
		
		SubjectForm subjectForm=(SubjectForm)form;
		Subject subject=subjectForm.getSubject();
		int id=subject.getId();
		
		//true 鍒犻櫎姝よ�冭瘯绉戠洰鎴愬姛
		if(service.deleteSubject(id)){

		}
		
		return null;
	}

	/** 4
	 * 鑾峰彇鎵�鏈夌殑鑰冭瘯绉戠洰
	 * @return list
	 */
	public ActionForward getALlSubject(ActionMapping arg0, ActionForm form,
			HttpServletRequest arg2, HttpServletResponse arg3) throws Exception {
		System.out.println("getALlSubject");
		
		List<Subject> list=service.getALlSubject();
		arg2.setAttribute("list", list);
		
		return null;
	}
	
	
	/** 5 
	 * 鑾峰彇鏌愪竴鑰冭瘯绉戠洰鐨勮�冭瘯璇曢
	 */
	public ActionForward getQuestionsBySubjectByid(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		System.out.println("getQuestionsBySubjectByid");
		response.setContentType("text/html;charset=UTF-8");
		SubjectForm subjectForm=(SubjectForm)form;
		Subject subject=subjectForm.getSubject();
		
		int subject_id=subject.getId();
		
		System.out.println("subject_id="+subject_id);
		
		String subjectName=null;
		if(subject_id==1){
			subjectName="璇枃"; 
		}else if(subject_id==2){
			subjectName="鏁板";
		}else if(subject_id==3){
			subjectName="鑻辫";
		}else if(subject_id==4){
			subjectName="Java闈㈠悜瀵硅薄缂栫▼";
		}else if(subject_id==5){
			subjectName="JSP缃戠粶缂栫▼";
		}else if(subject_id==6){
			subjectName="J2EE楂樼骇Web搴旂敤缂栫▼";
		}
		System.out.println("****************"+subjectName); 
		request.getSession().setAttribute("subjectName", subjectName);
		request.getSession().setAttribute("subject_id", subject_id);
		
		Set<Questions> set=service.getQuestionsBySubjectByid(subject_id);
		
		request.getSession().setAttribute("questionset", set);
		
		Users users=(Users)request.getSession().getAttribute("usersLogin");
		
		if(users.getIsmanager()==0){//鑰冪敓绾у埆
			return mapping.findForward("answerQuestions");
		}else if(users.getIsmanager()==1){//绠＄悊鍛�
			return mapping.findForward("managerQuestions");
		}
		response.getWriter().println("<center><p style='color:pink'>瀵逛笉璧蜂綘涓嶆槸鍚堟硶鏄敤鎴凤紝璇烽噸鏂扮櫥褰�</p></center>");
		response.getWriter().close();
		return mapping.findForward("index");

	}
	
	/**
	 * 6 鑾峰彇鍗曚釜绉戠洰绫诲埆鐨勬墍鏈夎�冭瘯绉戠洰
	 */
	public ActionForward getSubjectBySubjectTypeByid(ActionMapping arg0, ActionForm form,
			HttpServletRequest arg2, HttpServletResponse arg3) throws Exception {
		System.out.println("getSubjectBySubjectTypeByid");
		
		return null;
	}
	
	
	
}
