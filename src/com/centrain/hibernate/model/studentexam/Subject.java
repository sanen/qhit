package com.centrain.hibernate.model.studentexam;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
/**
 * 
 * ��Ŀ��ѧ������ �� ���һ
 * @author zhangkehua
 *
 */
@SuppressWarnings("serial")
public class Subject implements Serializable {

	private int id;//考试科目编号
	private String subject;//考试科目名称
	private String jieduan;//阶段
	
	private SubjectType subjectType;//科目类别
	
	/**
	 * �� ���ġ���ѧ��Ӣ�����(�����)����ʷ�����Ρ���ѧ�����?��������������ֵ�
	 * �ǻ�����ࡢ��ó�ࡢ������ ��
	 */
	private Set<Questions> questions=new HashSet<Questions>();
	
	public Set<Questions> getQuestions() {
		return questions;
	}
	public void setQuestions(Set<Questions> questions) {
		this.questions = questions;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getJieduan() {
		return jieduan;
	}
	public void setJieduan(String jieduan) {
		this.jieduan = jieduan;
	}
	public SubjectType getSubjectType() {
		return subjectType;
	}
	public void setSubjectType(SubjectType subjectType) {
		this.subjectType = subjectType;
	}
	
	
	
}
