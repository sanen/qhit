package com.centrain.hibernate.service.twelfth.practice;

import java.util.List;

import com.centrain.hibernate.model.twelfth.practice.Student;

public interface StudentService {

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
	public Student getStudentById(Integer sid);
	
	/**
	 * �޸�ѧԱ��Ϣ  ��(���� ���� �Լ���Ӧ�ĳɼ�
	 */
	public boolean updateStudent(Student student);
	
	
	
	/**
	 * ɾ��ѧԱ
	 * @param id
	 * @return
	 */
	public boolean deleteStudent(Integer id);
	
	
	/**
	 * �������ѧԱ������  ����
	 * @return
	 */ 
	public List<Object[]> getAllStudentNames();
	
	
	/**
	 * ��ѯ������ѧԱ��Ϣ
	 * @return
	 */
	public List<Student> getQuery();
	
}
