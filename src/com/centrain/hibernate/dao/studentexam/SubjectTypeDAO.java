package com.centrain.hibernate.dao.studentexam;

import java.util.List;

import com.centrain.hibernate.model.studentexam.SubjectType;
/**
 * 
 * ���Կ�Ŀ���
 * @author zhangkehua
 *
 */
public interface SubjectTypeDAO {
	
	/** 1
	 * ��ӿ��Կ�Ŀ��� 
	 * �磺
	 * �� ���ġ���ѧ��Ӣ�����(�����)����ʷ�����Ρ���ѧ�����?��������������ֵ�
	 * �ǻ�����ࡢ��ó�ࡢ������ ��
	 * @param subjectType
	 * @return
	 */
	public boolean insertSubjectType(SubjectType subjectType);
	
	/** 2
	 * ɾ���Կ�Ŀ���
	 * @param id
	 * @return
	 */
	public boolean deleteSubjectTypeByid(int id);
	
	/** 3
	 * ��ȡ���еĿ��Կ�Ŀ���
	 * @return
	 */
	public List<SubjectType> getAllSubjectType(); 
	
	/** 4
	 * ��ȡ�����Կ�Ŀ���  ��Ŀ���
	 * @param id
	 * @return
	 */
	public SubjectType getSubjectTypeById(int id);
	
}
