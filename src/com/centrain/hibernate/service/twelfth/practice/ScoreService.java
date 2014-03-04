package com.centrain.hibernate.service.twelfth.practice;

import java.util.List;

import com.centrain.hibernate.model.twelfth.practice.Score;
import com.centrain.hibernate.model.twelfth.practice.Student;

public interface ScoreService {

	/**
	 * ���ѧԱ
	 * @param student
	 */
	public boolean addScore(Score score);
	
	/**
	 * ���Ҫ�޸ĵ�ѧԱ��Ϣ ��(���� ���� �Լ���Ӧ�ĳɼ�
	 * student_id=score_id ��ͳһ��
	 * @param sid
	 * @return
	 */
	public Student getStudentByScoreId(Integer score_id);
	
	/**
	 * �޸�ѧԱ��Ϣ  ��(���� ���� �Լ���Ӧ�ĳɼ�
	 */
	public boolean updateScore(Score score);
		
	
	/**
	 * ɾ��ѧԱ
	 * @param id
	 * @return
	 */
	public boolean deleteScore(Integer score__id);
		
	/**
	 * ��ѯ������ѧԱ��Ϣ
	 * @return
	 */
	public List<Score> getQuery();
	
}
