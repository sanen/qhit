package com.centrain.struts.action.studentexam;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.centrain.hibernate.model.studentexam.Subject;
import com.centrain.hibernate.model.studentexam.SubjectType;
import com.centrain.hibernate.service.studentexam.SubjectService;
import com.centrain.hibernate.service.studentexam.SubjectTypeService;
import com.centrain.hibernate.service.studentexam.impl.SubjectServiceImpl;
import com.centrain.hibernate.service.studentexam.impl.SubjectTypeServiceImpl;
import com.centrain.struts.form.studentexam.SubjectTypeForm;
/**
 * 
 * @author zhangkehua
 *
 */ 
public class SubjectTypeAction extends DispatchAction {

	
	SubjectTypeService service=new SubjectTypeServiceImpl();
	SubjectService subjectService=new SubjectServiceImpl();
	public ActionForward insertSubjectType(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		System.out.println("insertSubjectType");
		SubjectTypeForm subjectTypeForm=(SubjectTypeForm)form;
		SubjectType subjectType=subjectTypeForm.getSubjectType();
		
		if(service.insertSubjectType(subjectType)){
			
		}
		return null;
	}
	

	public ActionForward deleteSubjectTypeByid(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		System.out.println("deleteSubjectTypeByid");
		SubjectTypeForm subjectTypeForm=(SubjectTypeForm)form;
		SubjectType subjectType=subjectTypeForm.getSubjectType();
		int id=subjectType.getId();
		
		if(service.deleteSubjectTypeByid(id)){
			
		}
		
		return null;
	}
	
	public ActionForward getAllSubjectType(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		System.out.println("getAllSubjectType");
		
		List<SubjectType> list=service.getAllSubjectType();
		request.setAttribute("list", list);
		
		return null;
	}
	
	public ActionForward getAll(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		System.out.println("getAll");
		
		List<SubjectType> list=service.getAllSubjectType();
		request.getSession().setAttribute("allType", list);
		List<Subject> set=null;
		for (SubjectType subjectType:list) {
			set=subjectService.getSubjectBySubjectTypeByid(subjectType.getId());
			System.out.println(set.size());
		} 
		request.getSession().setAttribute("allSet", set);
		return mapping.findForward("managerSubjects");
	}

	
}
