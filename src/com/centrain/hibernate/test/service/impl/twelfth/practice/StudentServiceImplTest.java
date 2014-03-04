package com.centrain.hibernate.test.service.impl.twelfth.practice;



import java.util.List;

import com.centrain.hibernate.model.twelfth.practice.Student;
import com.centrain.hibernate.service.twelfth.practice.StudentService;
import com.centrain.hibernate.service.twelfth.practice.impl.StudentServiceImpl;

public class StudentServiceImplTest implements StudentService{

	static StudentService studentService=new StudentServiceImpl(); 

	/**
	 * ���ѧԱ����
	 * @param student
	 */
	public boolean addStudent(Student student) {
		
		return studentService.addStudent(student);
	}
	
	/**����
	 * ���Ҫ�޸ĵ�ѧԱ��Ϣ ��(���� ���� �Լ���Ӧ�ĳɼ�
	 * @param sid
	 * @return
	 */
	public Student getStudentById(Integer sid) {
		return studentService.getStudentById(sid);
	}


	/**
	 * �޸�ѧԱ��Ϣ ���� 
	 * ��(���� ���� �Լ���Ӧ�ĳɼ�
	 */
	public boolean updateStudent(Student student) {
		
		return studentService.updateStudent(student);
	}
	
	/**
	 * ɾ��ѧԱ����
	 * @param id
	 * @return
	 */
	public boolean deleteStudent(Integer id) {
		
		return  studentService.deleteStudent(id);
		
	}

	/**
	 * �������ѧԱ������  ������� 
	 * @return
	 */ 
	public List<Object[]> getAllStudentNames() {
		
		return studentService.getAllStudentNames();
	}

	/**
	 * ��ѯ������ѧԱ��Ϣ����
	 * @return
	 */
	public List<Student> getQuery() {
		return studentService.getQuery();
	}

	

	/**
	 * �ܲ��Է���
	 * @return
	 */
	public static void main(String[] args) {
		 
	}
}
