package com.centrain.hibernate.model;

import java.io.Serializable;
//ѧ���ɼ���
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;//ѧԱ���
	private String className;//�༶����
	private String studentName;//ѧԱ����
	private float chineseMarks;//���ĳɼ�
	private float mathMarks;//��ѧ�ɼ�
	private float englishMarks;//Ӣ��ɼ�
//	private int totalMarks=chineseMarks+mathMarks+englishMarks;//�ܳɼ�
	
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public float getChineseMarks() {
		return chineseMarks;
	}
	public void setChineseMarks(float chineseMarks) {
		this.chineseMarks = chineseMarks;
	}
	public float getMathMarks() {
		return mathMarks;
	}
	public void setMathMarks(float mathMarks) {
		this.mathMarks = mathMarks;
	}
	public float getEnglishMarks() {
		return englishMarks;
	}
	public void setEnglishMarks(float englishMarks) {
		this.englishMarks = englishMarks;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
