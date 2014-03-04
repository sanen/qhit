package com.centrain.hibernate.dao.studentexam;

import java.util.List;

import com.centrain.hibernate.model.studentexam.Questions;

/**
 * 考试试题数据层接口
 * @author zhangkehua
 *
 */

public interface QuestionsDAO {

	/** 1 删除考试试题
	 * @return 
	 */
	public boolean deleteQuestion(int question_id);
	 
	/** 2  获取所有的考试试题
	 * @return
	 */
	public List<Questions> getAllQuestions();
	
	/** 3 添加相应考试科目的考试试题
	 * @param questions
	 * @return
	 */
	public boolean addQuestion(Questions questions);
	
	/** 4
	 * 获取单个考试科目所有的考试试题
	 * @param subject_id
	 * @return
	 */
	public List<Questions> getAllQuestionsBySubject(int subject_id);
	
	/** 
	 * 5 获取单个考试试题对象
	 * @param id
	 * @return
	 */
	public Questions getQuestionByid(int id);
}
