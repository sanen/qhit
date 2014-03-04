package com.centrain.hibernate.model;

import java.io.Serializable;
//学生成绩表
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;//学员编号
	private String className;//班级名称
	private String studentName;//学员姓名
	private float chineseMarks;//语文成绩
	private float mathMarks;//数学成绩
	private float englishMarks;//英语成绩
//	private int totalMarks=chineseMarks+mathMarks+englishMarks;//总成绩
	
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
