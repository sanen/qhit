package com.centrain.hibernate.service.studentexam;

import java.util.List;
import java.util.Set;

import com.centrain.hibernate.model.studentexam.Questions;
import com.centrain.hibernate.model.studentexam.Subject;

public interface SubjectService {

	/** 1
	 * 给相应的科目类别添加考试科目
	 * @param subject
	 * @return
	 */
	public boolean addSubject(Subject subject);
	
	/** 2
	 * 检测此科目类别的考试科目是否存在
	 * @param subject
	 * @return true 存在  false不存在
	 */
	public boolean checkSubjectExist(Subject subject);
	/** 3
	 * 删除相应的科目类别的考试科目
	 * * @param id
	 * @return
	 */
	public boolean deleteSubject(int id);
	
	/** 4
	 * 获取所有的考试科目
	 * @return list
	 */
	public List<Subject> getALlSubject();
	
	/** 5 
	 * 获取某一考试科目的考试试题
	 */
	public Set<Questions> getQuestionsBySubjectByid(int subject_id);
	
	/**
	 * 6 获取单个科目类别的所有考试科目
	 */
	public List<Subject> getSubjectBySubjectTypeByid(int subjectType_id); 
}
