package com.centrain.hibernate.service.studentexam.impl;

import java.util.List;
import java.util.Set;

import com.centrain.hibernate.dao.studentexam.SubjectDAO;
import com.centrain.hibernate.dao.studentexam.impl.SubjectDAOHibImpl;
import com.centrain.hibernate.model.studentexam.Questions;
import com.centrain.hibernate.model.studentexam.Subject;
import com.centrain.hibernate.service.studentexam.SubjectService;


public class SubjectServiceImpl implements SubjectService {

	SubjectDAO subjectDAO=new SubjectDAOHibImpl();
	
	/** 1
	 * 给相应的科目类别添加考试科目
	 * @param subject
	 * @return
	 */
	public boolean addSubject(Subject subject) {
		
		return subjectDAO.addSubject(subject);
	}

	/** 2
	 * 检测此科目类别的考试科目是否存在
	 * @param subject
	 * @return true 存在  false不存在
	 */
	public boolean checkSubjectExist(Subject subject) {
		return subjectDAO.checkSubjectExist(subject);
	}

	/** 3
	 * 删除相应的科目类别的考试科目
	 * * @param id
	 * @return
	 */
	public boolean deleteSubject(int id) {
		return subjectDAO.deleteSubject(id);
	}

	/** 4
	 * 获取所有的考试科目
	 * @return list
	 */
	public List<Subject> getALlSubject() {
		return subjectDAO.getALlSubject();
	}
	
	/** 5 
	 * 获取某一考试科目的考试试题
	 */
	public Set<Questions> getQuestionsBySubjectByid(int subject_id) {
		return subjectDAO.getQuestionsBySubjectByid(subject_id);
	}
	
	/**
	 * 6 获取单个科目类别的所有考试科目
	 */
	public List<Subject> getSubjectBySubjectTypeByid(int subjectType_id) {
		return subjectDAO.getSubjectBySubjectTypeByid(subjectType_id);
	}

}
