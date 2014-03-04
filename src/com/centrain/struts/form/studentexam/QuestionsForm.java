package com.centrain.struts.form.studentexam;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.centrain.hibernate.model.studentexam.Questions;
/**
 * 考试试题ActionForm
 * @author zhangkehua
 *
 * Mar 3, 2013
 */
@SuppressWarnings("serial")
public class QuestionsForm extends ActionForm {
	
	//考试试题实体对象
	private Questions questions=new Questions();
	private String method;//操作方法标志

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Questions getQuestions() {
		return questions;
	}

	public void setQuestions(Questions questions) {
		this.questions = questions;
	}
	

	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		
		ActionErrors error=new ActionErrors();
		
		if(method.equals("addQuestion")){
			//考试试题
			if(questions.getQuestion()==null||"".equals(questions.getQuestion())){
				ActionMessage messages=new ActionMessage("考试试题不能为空!",false);
				error.add("error.question",messages);
			
			}
			//试题答案A
			if(questions.getAnswerA()==null||"".equals(questions.getAnswerA())){
				ActionMessage messages=new ActionMessage("试题答案A不能为空!",false);
				error.add("error.answerA",messages);
			
			}
			//试题答案B
			if(questions.getAnswerB()==null||"".equals(questions.getAnswerB())){
				ActionMessage messages=new ActionMessage("试题答案B不能为空!",false);
				error.add("error.answerB",messages);
			
			}
			//试题答案C
			if(questions.getAnswerC()==null||"".equals(questions.getAnswerC())){
				ActionMessage messages=new ActionMessage("试题答案C不能为空!",false);
				error.add("error.answerC",messages);
			}
			//试题答案D
			if(questions.getAnswerD()==null||"".equals(questions.getAnswerD())){
				ActionMessage messages=new ActionMessage("试题答案D不能为空!",false);
				error.add("error.answerD",messages);
			
			}
			//正确答案
			if(questions.getRightAnswer()==null||"".equals(questions.getRightAnswer())){
				ActionMessage messages=new ActionMessage("正确答案不能为空!",false);
				error.add("error.rightAnswer",messages);
			}
		}
		return error;
	}
	
	
}
