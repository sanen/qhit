package com.centrain.struts.action.twelfth.practice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.centrain.hibernate.model.twelfth.practice.Score;
import com.centrain.hibernate.model.twelfth.practice.Student;
import com.centrain.hibernate.service.twelfth.practice.ScoreService;
import com.centrain.hibernate.service.twelfth.practice.StudentService;
import com.centrain.hibernate.service.twelfth.practice.impl.ScoreServiceImpl;
import com.centrain.hibernate.service.twelfth.practice.impl.StudentServiceImpl;
import com.centrain.struts.form.twelfth.practice.StudentForm;

public class StudentAction extends DispatchAction {

	static StudentService studentService=new StudentServiceImpl();
	static ScoreService scoreService=new ScoreServiceImpl();
	
	/** 1
	 * 
	 * ���ѧԱ  �����ѧԱ����Ϣ �Լ� ѧԱ�ɼ���Ϣ
	 */
	public ActionForward insert(ActionMapping arg0, ActionForm form,
			HttpServletRequest arg2, HttpServletResponse response) throws Exception {
		
		response.setContentType("text/html;charset=gbk");
		
		//System.out.println("ok");
		
		Student student=new Student();
		
		StudentForm studentForm=(StudentForm)form;
		
		student=studentForm.getStudent();
		
		Score score=new Score();
		
		score=studentForm.getScore();
		
		System.out.println("��ѧ="+studentForm.getScore().getShuxue());
		System.out.println("����="+studentForm.getScore().getYewen());
		
		Set<Score> set=new HashSet<Score>();
		
		set.add(score);
				
		student.setScore(set);
		 
		if(studentService.addStudent(student)){
			response.getWriter().println("��ӳɹ�");		
			response.getWriter().println("<a href='ForwardActionBack.do'>�������</a>");
		}else{
			response.getWriter().println("���ʧ��");
		}
		
		return null;
		
	}
	
	/** 2
	 * 
	 * ��ѯ�����е�ѧԱ���� ��(���ر��
	 */
	public ActionForward showStuName(ActionMapping arg0, ActionForm arg1,
			HttpServletRequest request, HttpServletResponse arg3) throws Exception {
		
		System.out.println("showStuName");
		
		List<Student> list=studentService.getQuery();
		
		Student student=list.get(0);
		Set<Score> set=student.getScore();
		
		for(Score score:set){
			request.setAttribute("score", score);
		}
		
		
		request.setAttribute("list", list);
		
		return new ActionForward("/twelfthpractice/showStuname.jsp");
	}
	
	/** 3
	 * 
	 * ��ѯ��Ҫ���µ�ѧԱ��Ϣ ��( ����Ϣ �� �ɼ���Ϣ
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 * @return
	 * @throws Exception
	 */
	
	public ActionForward updateStudent(ActionMapping arg0, ActionForm form,
			HttpServletRequest request, HttpServletResponse arg3) throws Exception {
		
		System.out.println("updateStudent");
		
		StudentForm studentForm=(StudentForm)form;
		
		Student student=studentForm.getStudent();
		
		Integer sid=student.getSid();
		
		Student updateStudent=studentService.getStudentById(sid);
		
		Set<Score> set=updateStudent.getScore();
		
		for(Score score:set){
			request.setAttribute("score", score);
		}
		
		request.setAttribute("student", updateStudent);
		
		return new ActionForward("/twelfthpractice/showStudent.jsp");
	}

	/** 4
	 * 
	 * ����ѧԱ��Ϣ ��( ����Ϣ �� �ɼ���Ϣ
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 * @return
	 * @throws Exception
	 */
	
	public ActionForward update(ActionMapping arg0, ActionForm form,
			HttpServletRequest arg2, HttpServletResponse response) throws Exception {
		
		System.out.println("update");
		
		StudentForm studentForm=(StudentForm)form;
		
		Student student=studentForm.getStudent();
		
		Score score=studentForm.getScore();
		
		student.getScore().add(score);
		
		if(studentService.updateStudent(student)){
			return query(arg0, form, arg2, response);
		}else{
			response.getWriter().println("����ʧ��");
		}	
		return null;
	}
	
	/** 5
	 * 
	 * ɾ��ѧԱ ��ɾ���ѧԱ�Ļ���Ϣ �Լ��ɼ���Ϣ 
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 * @return
	 * @throws Exception
	 */
	public ActionForward delete(ActionMapping arg0, ActionForm form,
			HttpServletRequest arg2, HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=gbk");
		
		System.out.println("delete");
		StudentForm studentForm=(StudentForm)form;
		
		if(scoreService.deleteScore(studentForm.getStudent().getSid())){
			response.getWriter().println("ɾ��ɹ�");		
		}else{
			response.getWriter().println("ɾ��ʧ��");
		}
		return query(arg0, form, arg2, response);
	}
	
	/**
	 * ��ѯ������ѧԱ����Ϣ 
	 */
	public ActionForward query(ActionMapping arg0, ActionForm arg1,
			HttpServletRequest arg2, HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=gbk");
		
		System.out.println("query");
		
		List<Score>  list=scoreService.getQuery();
		 
		arg2.setAttribute("list", list);
		
		return new ActionForward("/twelfthpractice/studentinfo.jsp");
	}
	
	
}
