package com.centrain.hibernate.service.studentexam.impl;

import java.util.List;

import com.centrain.hibernate.dao.studentexam.SubjectTypeDAO;
import com.centrain.hibernate.dao.studentexam.impl.SubjectTypeDAOHibImpl;
import com.centrain.hibernate.model.studentexam.SubjectType;
import com.centrain.hibernate.service.studentexam.SubjectTypeService;

/**
 * 
 * ���Կ�Ŀ��� �����ʵ��
 * @author zhangkehua
 *
 */
public class SubjectTypeServiceImpl implements SubjectTypeService {

	SubjectTypeDAO subjectTypeDAO=new SubjectTypeDAOHibImpl();
	
	/** 1
	 * ��ӿ��Կ�Ŀ��� 
	 * �磺
	 * �� ���ġ���ѧ��Ӣ�����(�����)����ʷ�����Ρ���ѧ�����?��������������ֵ�
	 * �ǻ�����ࡢ��ó�ࡢ������ ��
	 * @param subjectType
	 * @return
	 */
	public boolean insertSubjectType(SubjectType subjectType) {
		return subjectTypeDAO.insertSubjectType(subjectType);
	}
	
	/** 2
	 * ɾ���Կ�Ŀ���
	 * @param id
	 * @return
	 */
	public boolean deleteSubjectTypeByid(int id) {
		return subjectTypeDAO.deleteSubjectTypeByid(id);
	}

	/** 3
	 * ��ȡ���еĿ��Կ�Ŀ���
	 * @return
	 */
	public List<SubjectType> getAllSubjectType() {
		return subjectTypeDAO.getAllSubjectType();
	}

	/**
	 * ��ȡ�����Կ�Ŀ���
	 * @param id
	 * @return
	 */
	public SubjectType getSubjectTypeById(int id) {
		return subjectTypeDAO.getSubjectTypeById(id);
	}



}
