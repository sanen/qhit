package com.centrain.hibernate.test.service.impl.studentexam;

import java.util.List;
import java.util.Set;

import com.centrain.hibernate.model.studentexam.Questions;
import com.centrain.hibernate.model.studentexam.Subject;
import com.centrain.hibernate.service.studentexam.SubjectService;
import com.centrain.hibernate.service.studentexam.impl.SubjectServiceImpl;

public class SubjectServiceTest implements SubjectService{

	SubjectService subjectService=new SubjectServiceImpl();
	
	/** 1
	 * 给相应的科目类别添加考试科目
	 * @param subject
	 * @return
	 */
	public boolean addSubject(Subject subject) {
		return subjectService.addSubject(subject);
	}

	/** 2
	 * 检测此科目类别的考试科目是否存在
	 * @param subject
	 * @return true 存在  false不存在
	 */
	public boolean checkSubjectExist(Subject subject) {
		return subjectService.checkSubjectExist(subject);
	}

	/** 3
	 * 删除相应的科目类别的考试科目
	 * * @param id
	 * @return
	 */
	public boolean deleteSubject(int id) {
		return subjectService.deleteSubject(id);
	}

	/** 4
	 * 获取所有的考试科目
	 * @return list
	 */
	public List<Subject> getALlSubject() {
		return subjectService.getALlSubject();
	}
	
	
	/** 5 
	 * 获取某一考试科目的考试试题
	 */
	public Set<Questions> getQuestionsBySubjectByid(int subejct_id) {
		return subjectService.getQuestionsBySubjectByid(subejct_id);
	}
	
	/**
	 * 6 获取单个科目类别的所有考试科目
	 */
	public List<Subject> getSubjectBySubjectTypeByid(int subjectType_id) {
		return subjectService.getSubjectBySubjectTypeByid(subjectType_id);
	}
	
	
	/**
	 * 测试方法
	 * @param args
	 */
	public static void main(String[] args) {
		
//		//操作对象
		SubjectServiceTest test=new SubjectServiceTest();
//		SubjectTypeServiceTest typetest=new SubjectTypeServiceTest();
		
//		// 1 给相应的科目类别添加考试科目
//		Subject subject=new Subject();
//		subject.setSubject("J2EE�߼�WebӦ�ñ��");
//		subject.setSubject("J2EE�߼�WebӦ�ñ��");//"JSP������");//"Java���������");//"Ӣ��");//"��ѧ");//"����");
//		SubjectType subjectType=typetest.getSubjectTypeById(2);
//		subject.setSubjectType(subjectType);
//		System.out.println(test.addSubject(subject));
		
		
//		// 2 检测此科目类别的考试科目是否存在
//		Subject subject=new Subject();
//		subject.setSubject("JSP");
//		System.out.println(test.checkSubjectExist(subject));
		
//		// 3 删除相应的科目类别的考试科目
//		test.deleteSubject(1);
		
//		// 4 获取所有的考试科目
//		List<Subject> list=test.getALlSubject();
//		for(Subject subject:list){
//			System.out.println(subject.getId()+":"+subject.getSubject());
//		}
		
		//5  获取某一考试科目的考试试题 
		List<Subject> list=test.getALlSubject();
		for (int i = 0; i < list.size(); i++) {
			Subject subject=new Subject();
			Set<Questions> set=test.getQuestionsBySubjectByid(subject.getId());
			for(Questions questions:set){
				System.out.println(subject.getSubject()+":"+questions.getQuestion());
			}
		}
		
		//6  获取单个科目类别的所有考试科目
		
		//获取方式一
//		List<SubjectType> list2=typetest.getAllSubjectType();
//		for (int i = 0; i < list2.size(); i++) {
//			SubjectType subjectType=list2.get(i);
//			System.out.println(subjectType.getSubjectType());
//			
//			Set<Subject> set=test.getSubjectBySubjectTypeByid(subjectType.getId());
//			
//			for(Subject subject:set){
//				System.out.println("科目="+subject.getSubject());
//			}
//		}
		
		//获取方式二
//		for(SubjectType subjectType:list){
//			Set<Subject> set=test.getSubjectBySubjectTypeByid(subjectType.getId());
//			
//			for(Subject subject:set){
//				System.out.println(subjectType.getSubjectType()+":"+subject.getSubject());
//			}
//		}
		
		
	}

	

	
}
