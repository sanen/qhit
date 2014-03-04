package com.centrain.hibernate.dao.studentexam.impl;

import java.util.List;

import com.centrain.hibernate.dao.studentexam.SubjectTypeDAO;
import com.centrain.hibernate.model.studentexam.SubjectType;
import com.centrain.hibernate.dao.impl.BaseDAO;
/**
 * 
 * ���Կ�Ŀ���
 * @author zhangkehua
 *
 */
public class SubjectTypeDAOHibImpl extends BaseDAO implements SubjectTypeDAO {


	private final String hibernateCfgXmlName="hibernate.studentexam.cfg.xml";

	/** 1
	 * ��ӿ��Կ�Ŀ��� 
	 * �磺
	 * �� ���ġ���ѧ��Ӣ�����(�����)����ʷ�����Ρ���ѧ�����?��������������ֵ�
	 * �ǻ�����ࡢ��ó�ࡢ������ ��
	 * @param subjectType
	 * @return
	 */
	public boolean insertSubjectType(SubjectType subjectType) {
		return super.insertBoolean(subjectType,hibernateCfgXmlName);
	}

	/** 2
	 * ɾ���Կ�Ŀ���
	 * @param id
	 * @return
	 */
	public boolean deleteSubjectTypeByid(int id) {
		return super.deleteBoolean(SubjectType.class, id,hibernateCfgXmlName);
	}

	/** 3
	 * ��ȡ���еĿ��Կ�Ŀ���
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<SubjectType> getAllSubjectType() {
		return (List<SubjectType>) super.getAll("SubjectType",hibernateCfgXmlName);
	}

	/**
	 * ��ȡ�����Կ�Ŀ���
	 * @param id
	 * @return
	 */
	public SubjectType getSubjectTypeById(int id) {
		return (SubjectType) super.get(SubjectType.class, id,hibernateCfgXmlName);
	}
	

}
