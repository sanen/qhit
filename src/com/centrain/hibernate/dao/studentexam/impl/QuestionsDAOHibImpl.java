package com.centrain.hibernate.dao.studentexam.impl;

import java.util.List;

import com.centrain.hibernate.dao.impl.BaseDAO;
import com.centrain.hibernate.dao.studentexam.QuestionsDAO;
import com.centrain.hibernate.model.studentexam.Questions; 
/**
 * 鑰冭瘯璇曢DAO灞傛搷浣�
 * @author zhangkehua
 *
 * Mar 3, 2013
 */
public class QuestionsDAOHibImpl extends BaseDAO implements QuestionsDAO {

	private final String hibernateCfgXmlName="hibernate.studentexam.cfg.xml";
	/** 1 鍒犻櫎鑰冭瘯璇曢
	 * @return 
	 */
	public boolean deleteQuestion(int question_id) {
		return super.deleteBoolean(Questions.class, question_id,hibernateCfgXmlName);
	}

	/** 2  鑾峰彇鎵�鏈夌殑鑰冭瘯璇曢
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Questions> getAllQuestions() {
		return (List<Questions>) super.getAll("Questions",hibernateCfgXmlName);
	}
	
	/** 3 娣诲姞鐩稿簲鑰冭瘯绉戠洰鐨勮�冭瘯璇曢
	 * @param questions
	 * @return
	 */
	public boolean addQuestion(Questions questions) {
		return super.insertBoolean(questions,hibernateCfgXmlName);
	}
	
	/** 4
	 * 鑾峰彇鍗曚釜鑰冭瘯绉戠洰鎵�鏈夌殑鑰冭瘯璇曢
	 * @param subject_id
	 * @return
	 */
	public List<Questions> getAllQuestionsBySubject(int subject_id) {
		return null;
	}

	/** 
	 * 5 鑾峰彇鍗曚釜鑰冭瘯璇曢瀵硅薄
	 * @param id
	 * @return
	 */
	public Questions getQuestionByid(int id) {
		return (Questions) super.get(Questions.class, id,hibernateCfgXmlName);
	}
	 
	
}
