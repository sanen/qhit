package com.centrain.struts.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import org.apache.struts.actions.DispatchAction;

import com.centrain.hibernate.model.Student;
import com.centrain.hibernate.service.StudentService;
import com.centrain.hibernate.service.impl.StudentServiceImpl;
import com.centrain.struts.form.StudentForm;

public class StudentAction extends DispatchAction{

	StudentService studentService=new StudentServiceImpl();

	
	public ActionForward insert(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {

		Student student=getStudent(form);
		
		if(studentService.insert(student)>0){
			return this.select(mapping, form, request, response);
		}
		
		return mapping.findForward("index");
	}
	
	public ActionForward delete(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		Student student=getStudent(form);
		studentService.delete(student.getId());
		return this.select(mapping, form, request, response);
	}
	
	public ActionForward update(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		StudentForm studentForm=(StudentForm)form; 
		
		
		Student student=studentForm.getStudent();
		
		if(studentService.update(student)>0){
			return this.select(mapping, form, request, response);
		}
		
		return this.select(mapping, form, request, response);
	}

	public ActionForward selectById(ActionMapping arg0, ActionForm form,
			HttpServletRequest request, HttpServletResponse arg3) throws Exception {
		Student student=getStudent(form);
		
		Student getStudent=studentService.selectByid(student.getId());
		request.setAttribute("student", getStudent);
		
		return new ActionForward("/update.jsp");
	}
	
	public ActionForward select(ActionMapping mapping, ActionForm arg1,
			HttpServletRequest request, HttpServletResponse arg3) throws Exception {
		List<Student> list=studentService.selectAll("Student");
		
		servlet.getServletContext().setAttribute("list", list);
		
		return mapping.findForward("userinfo");
	}
	
	

	/**
	 * getStudent
	 * @param form
	 * @return
	 */
	public Student getStudent(ActionForm form){

		StudentForm studentForm=(StudentForm)form; 
		
		Student student =studentForm.getStudent();
		
		return student;
	}
	
	


	
}
