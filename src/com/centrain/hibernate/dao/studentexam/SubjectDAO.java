package com.centrain.hibernate.dao.studentexam;

import java.util.List;
import java.util.Set;

import com.centrain.hibernate.model.studentexam.Questions;
import com.centrain.hibernate.model.studentexam.Subject;

/**
 * 锟斤拷锟皆匡拷目锟斤拷锟斤拷
 * @author zhangkehua
 *
 */
public interface SubjectDAO {

	/** 1
	 * 锟斤拷涌锟斤拷钥锟侥� 
	 * 前锟斤拷锟角此匡拷锟皆匡拷目锟斤拷锟斤拷锟斤拷 
	 * @param subject
	 * @return
	 */
	public boolean addSubject(Subject subject);
	
	/** 2
	 * 锟斤拷锟斤拷锟接的匡拷锟皆匡拷目锟角凤拷锟窖撅拷锟斤拷锟斤拷
	 * @param subject
	 * @return 锟斤拷锟斤拷true 锟斤拷之 false
	 */
	public boolean checkSubjectExist(Subject subject);

	/** 3
	 * 删锟斤拷锟皆匡拷目
	 * 锟斤拷锟借级j删锟斤拷丝锟斤拷钥锟侥匡拷锟斤拷锟斤拷锟�
	 * @param id
	 * @return
	 */
	public boolean deleteSubject(int id);
	
	/** 4
	 * 锟斤拷取锟斤拷锟叫的匡拷锟皆匡拷目锟斤拷息
	 * @return
	 */
	public List<Subject> getALlSubject();
	
	/** 5
	 * 锟斤拷取锟斤拷锟斤拷锟皆匡拷目锟斤拷锟斤拷锟斤拷息
	 */
	public Set<Questions> getQuestionsBySubjectByid(int subject_id);
	
	/**
	 * 6 锟斤拷锟斤拷锟斤拷目
	 * 锟斤拷锟斤拷目锟斤拷锟侥匡拷目
	 */
	public List<Subject> getSubjectBySubjectTypeByid(int subjectType_id); 
}
