package com.centrain.hibernate.model.twelfth.practice;

import java.io.Serializable;
/**
 * 
 * @author zhangkehua
 *
 * ����ʵ��
 *
 */
@SuppressWarnings("serial")
public class Score implements Serializable {

	
	private Integer score_id;//�������

	private Integer yewen;//���ĳɼ�
	private Integer shuxue;//��ѧ�ɼ�
	
	private Student student;//ѧ������
	
	public Score(){}
	
	public Score(Student student, Integer yewen, Integer shuxue) {
		this.student = student;
		this.yewen = yewen;
		this.shuxue = shuxue;
	}



	
	public Integer getScore_id() {
		return score_id;
	}

	public void setScore_id(Integer score_id) {
		this.score_id = score_id;
	}

	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Integer getYewen() {
		return yewen;
	}
	public void setYewen(Integer yewen) {
		this.yewen = yewen;
	}
	public Integer getShuxue() {
		return shuxue;
	}
	public void setShuxue(Integer shuxue) {
		this.shuxue = shuxue;
	}
	
	
	
}
