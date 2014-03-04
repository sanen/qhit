package com.centrain.hibernate.test.service.impl.studentexam;

import java.util.List;

import com.centrain.hibernate.model.studentexam.SubjectType;
import com.centrain.hibernate.service.studentexam.SubjectTypeService;
import com.centrain.hibernate.service.studentexam.impl.SubjectTypeServiceImpl;
/**
 * 
 * ���Կ�Ŀ��� ������
 * @author zhangkehua
 *
 */
public class SubjectTypeServiceTest implements SubjectTypeService {

	
	SubjectTypeService service=new SubjectTypeServiceImpl();
	/** 1
	 * ��ӿ��Կ�Ŀ��� 
	 * �磺
	 * �� ���ġ���ѧ��Ӣ�����(�����)����ʷ�����Ρ���ѧ�����?��������������ֵ�
	 * �ǻ�����ࡢ��ó�ࡢ������ ��
	 * @param subjectType
	 * @return
	 */
	public boolean insertSubjectType(SubjectType subjectType) {
		return service.insertSubjectType(subjectType);
	}
	
	/** 2
	 * ɾ���Կ�Ŀ���
	 * @param id
	 * @return
	 */
	public boolean deleteSubjectTypeByid(int id) {
		return service.deleteSubjectTypeByid(id);
	}

	/** 3
	 * ��ȡ���еĿ��Կ�Ŀ���
	 * @return
	 */
	public List<SubjectType> getAllSubjectType() {
		return service.getAllSubjectType();
	}

	/**
	 * ��ȡ�����Կ�Ŀ���
	 * @param id
	 * @return
	 */
	public SubjectType getSubjectTypeById(int id) {
		return service.getSubjectTypeById(id);
	}
	
	public static void main(String[] args) {
		
//		SubjectTypeServiceTest test=new SubjectTypeServiceTest();
		
		//1  ��ӿ��Կ�Ŀ��� 
//		SubjectType subjectType=new SubjectType();
		//��ѧ����
//		subjectType.setSubjectType("��ѧ����");
//		test.insertSubjectType(subjectType);
		//���������
//		subjectType.setSubjectType("���������");
//		test.insertSubjectType(subjectType);
		
		//2 ɾ���Կ�Ŀ���
//		test.deleteSubjectTypeByid(2);
		
		
		//3 ��ȡ���еĿ��Կ�Ŀ���
//		List<SubjectType> list=test.getAllSubjectType();
//		for(SubjectType subjectType2:list){
//			System.out.println(subjectType2.getId()+":"+subjectType2.getSubjectType());
//		}
		
		//4 ��ȡ�����Կ�Ŀ���
//		System.out.println(test.getSubjectTypeById(1).getSubjectType());
		
	}

	
	
}
