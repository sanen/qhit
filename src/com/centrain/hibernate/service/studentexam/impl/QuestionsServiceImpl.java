package com.centrain.hibernate.service.studentexam.impl;

import java.util.List;

import com.centrain.hibernate.dao.studentexam.QuestionsDAO;
import com.centrain.hibernate.dao.studentexam.impl.QuestionsDAOHibImpl;
import com.centrain.hibernate.model.studentexam.Questions;
import com.centrain.hibernate.service.studentexam.QuestionsService;

/**
 * 考试试题服务层实现
 * @author zhangkehua
 *
 * Mar 3, 2013
 */
public class QuestionsServiceImpl implements QuestionsService{
	
	QuestionsDAO questionsDAO=new QuestionsDAOHibImpl();
	
	/** 1 删除考试试题
	 * @return 
	 */
	public boolean deleteQuestion(int question_id) {
		return questionsDAO.deleteQuestion(question_id);
	}
	 
	/** 2  获取所有的考试试题
	 * @return
	 */
	public List<Questions> getAllQuestions() {
		return questionsDAO.getAllQuestions();
	}

	/** 3 添加相应考试科目的考试试题
	 * @param questions
	 * @return
	 */
	public boolean addQuestion(Questions questions) {
		return questionsDAO.addQuestion(questions);
	}

	/** 4
	 * 获取单个考试科目所有的考试试题
	 * @return
	 */
	public List<Questions> getAllQuestionsBySubject(int subject_id) {
		return null;
	}

	/** 
	 * 5 获取单个考试试题对象
	 * @param id
	 * @return
	 */
	public Questions getQuestionByid(int id) {
		return questionsDAO.getQuestionByid(id);
	}

}
