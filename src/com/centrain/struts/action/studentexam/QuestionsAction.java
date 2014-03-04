package com.centrain.struts.action.studentexam;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.centrain.hibernate.model.studentexam.Questions;
import com.centrain.hibernate.model.studentexam.Subject;
import com.centrain.hibernate.service.studentexam.QuestionsService;
import com.centrain.hibernate.service.studentexam.impl.QuestionsServiceImpl;
import com.centrain.struts.form.studentexam.QuestionsForm;

public class QuestionsAction extends DispatchAction {

	QuestionsService questionsService=new QuestionsServiceImpl();
	
	/** 1 删除考试试题
	 * @return 
	 */
	public ActionForward deleteQuestion(ActionMapping arg0, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		response.setContentType("text/html;charset=UTF-8");
		System.out.println("deleteQuestion");
		
		QuestionsForm questionsForm=(QuestionsForm)form;
		Questions questions=questionsForm.getQuestions();
		int question_id=questions.getId();
		
		int subject_id=Integer.parseInt(String.valueOf(request.getSession().getAttribute("subject_id")));
		
		String subjectName=(String)request.getSession().getAttribute("subjectName");//�����Ŀ
		//true 删除考试试题成功
		if(questionsService.deleteQuestion(question_id)){
			response.getWriter().println("<body bgcolor='pink'><center>ɾ��"+subjectName+"��Ŀ������ɹ��������ϵͳ���Զ���鿴�ÿ�Ŀ�����ҳ��</center></body>");
			response.setHeader("refresh","3;url=SubjectAction.do?method=getQuestionsBySubjectByid&subject.id="+subject_id); 
			
		}else{
			response.getWriter().println("<body bgcolor='pink'><center>ɾ��"+subjectName+"��Ŀ������ʧ�ܣ������ϵͳ���Զ���鿴�ÿ�Ŀ�����ҳ��</center></body>");
			response.setHeader("refresh","3;url=SubjectAction.do?method=getQuestionsBySubjectByid&subject.id="+subject_id); 
		}  
		response.getWriter().close();
		
		return null;
	}
	
	/** 2  获取所有的考试试题
	 * @return
	 */
	public ActionForward getAllQuestionsBySubject(ActionMapping arg0, ActionForm form,
			HttpServletRequest arg2, HttpServletResponse arg3) throws Exception {
		
		System.out.println("getAllQuestionsBySubject");
		
		List<Questions> list=questionsService.getAllQuestions();
		arg2.setAttribute("list", list);
		
		return null;
	}


	/** 3 添加相应考试科目的考试试题
	 * @param questions
	 * @return
	 */
	public ActionForward addQuestion(ActionMapping arg0, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		System.out.println("addQuestion");
		response.setContentType("text/html;charset=gbk");
		QuestionsForm questionsForm=(QuestionsForm)form;
		Questions questions=questionsForm.getQuestions();
		int id=Integer.parseInt(String.valueOf(request.getSession().getAttribute("subject_id")));
		String subjectName=(String)request.getSession().getAttribute("subjectName");
		System.out.println("�����="+id);
		
		Subject subject=new Subject();
		subject.setId(id);
		
		questions.setSubject(subject);
		
		//true ��ӿ�������ɹ���֮ʧ��
		if(questionsService.addQuestion(questions)){
			response.getWriter().println("<body bgcolor='pink'><center>���"+subjectName+"��Ŀ������ɹ�,}���,ϵͳ���Զ���ת������ҳ��</center></body>");
			response.setHeader("refresh","2;url=FunctionAction.do"); 
		}else{
			response.getWriter().println("<body bgcolor='pink'><center>���"+subjectName+"��Ŀ������ʧ��,}���,ϵͳ���Զ���ת����Ӹÿ�Ŀҳ��</center></body>");
			response.setHeader("refresh","2;url=AddQuestionAction.do"); 
		}
		response.getWriter().close();
		
		return null;
	}

	/**  4  答题
	 *  判定考生所答试题是否正确
	 */
	public ActionForward answer(ActionMapping arg0, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		response.setContentType("text/html;charset=UTF-8");
		
		QuestionsForm questionsForm=(QuestionsForm)form;
		Questions questions=questionsForm.getQuestions();
		int id=questions.getId();
		System.out.println("question_id="+id);
		String rightAnswer=questions.getRightAnswer();//�û�����
		
		Questions successQuestion=questionsService.getQuestionByid(id);
		String answer=successQuestion.getRightAnswer();//��ȷ��
		
		//true 考试答题正确
		if(rightAnswer.equals(answer)){
			response.getWriter().println("<body bgcolor='pink'><center>����ش���ȷ</center><br><center><a href='answerQuestions.jsp'>�������</a></center></body>");
		}else{
			response.getWriter().println("<body bgcolor='pink'><center>����ش������ȷ����"+answer+"</center><center><a href='answerQuestions.jsp'>�������</a></center></body>");
			
		}
		response.getWriter().close();
			
		return null;
	}
	
	/**
	 *  5 获取单个考试试题信息
	 */
	public ActionForward getQuestionByid(ActionMapping arg0, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		response.setContentType("text/html;charset=UTF-8");
		
		QuestionsForm questionsForm=(QuestionsForm)form;
		Questions questions=questionsForm.getQuestions();
		int id=questions.getId();
		Questions questions2=questionsService.getQuestionByid(id);
		request.setAttribute("quetions", questions2);
		
		return null;
	}
	
	
}
