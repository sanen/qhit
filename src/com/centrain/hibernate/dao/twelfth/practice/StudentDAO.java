package com.centrain.hibernate.dao.twelfth.practice;


import java.util.List;

import com.centrain.hibernate.model.twelfth.practice.Student;

public interface StudentDAO {

	/**
	 * ���ѧԱ
	 * @param student
	 */
	public boolean addStudent(Student student);
	
	
	
	/**
	 * ���Ҫ�޸ĵ�ѧԱ��Ϣ ��(���� ���� �Լ���Ӧ�ĳɼ�
	 * @param sid
	 * @return
	 */
	public Student getStudentById(Integer id);
	
	/**
	 * �޸�ѧԱ��Ϣ  ��(���� ���� �Լ���Ӧ�ĳɼ�
	 */
	public boolean updateStudent(Student student);
	
	
	/**
	 * �������ѧԱ������  ����
	 * @return
	 */ 
	public List<Object[]> getAllStudentNames();
	
	
	
	
	/**
	 * ɾ��ѧԱ
	 * @param id
	 * @return
	 */
	public boolean deleteStudent(Integer student_id);
	
	/**
	 * ��ѯ������ѧԱ��Ϣ
	 * �������ѧԱ��Ϣ ��(��ѧԱ����Ϣ�Լ��ɼ���Ϣ��
	 * @return
	 */
	public List<Student> getQuery();
	

	
	
}
