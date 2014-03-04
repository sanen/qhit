package com.centrain.hibernate.test.service.impl.studentexam;

import java.util.List;

import com.centrain.hibernate.model.studentexam.Questions;
import com.centrain.hibernate.service.studentexam.QuestionsService;
import com.centrain.hibernate.service.studentexam.impl.QuestionsServiceImpl;

/**
 * 考试试题服务层实现测试类
 * @author zhangkehua
 *
 * Mar 3, 2013
 */
public class QuestionsServiceTest implements QuestionsService{

	QuestionsService questionsService=new QuestionsServiceImpl();
	
	 
	/** 1 删除考试试题
	 * @return 
	 */
	public boolean deleteQuestion(int question_id) {
		return questionsService.deleteQuestion(question_id);
	}
	

	/** 2  获取所有的考试试题
	 * @return
	 */
	public List<Questions> getAllQuestions(){
		return questionsService.getAllQuestions();
	}
	
	/** 3 添加相应考试科目的考试试题
	 * @param questions
	 * @return
	 */
	public boolean addQuestion(Questions questions) {
		return questionsService.addQuestion(questions);
	}

	/** 4
	 * 获取单个考试科目所有的考试试题
	 * @return
	 */
	public List<Questions> getAllQuestionsBySubject(int subject_id) {
		return null;
	}

	/** 
	 * 5 获取单个考试试题对象
	 * @param id
	 * @return
	 */
	public Questions getQuestionByid(int id) {
		return questionsService.getQuestionByid(id);
	}
	
	/**
	 * 测试方法
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		QuestionsServiceTest test=new QuestionsServiceTest();
//		Questions questions=new Questions();
		
//		questions.setQuestion("Java����������������ǣ�");
//		questions.setAnswerA("��װ");
//		questions.setAnswerB("�̳�");
//		questions.setAnswerC("��̬");
//		questions.setAnswerD("�ۺ�");
//		questions.setRightAnswer("ABC");
		
		
//		questions.setQuestion("J2EEWeb���ÿ�������ǣ�");
//		questions.setAnswerA("Struts+hibernate");
//		questions.setAnswerB("struts+Spring");
//		questions.setAnswerC("Hibernate+Spring");
//		questions.setAnswerD("Struts+hibernate+Spring");
//		questions.setRightAnswer("D");
//		Session session=null;
//		
//		try {
//			session=HibernateSessionFactory.getSession();
//			questions.setSubject((Subject)session.get(Subject.class,6));
//		} catch (HibernateException e) {
//			e.printStackTrace();
//		}finally{
//			session.close();
//		}
		// 添加相应考试科目的考试试题
//		test.addQuestion(questions);
		
		// 删除考试试题
//		test.deleteQuestion(2);
		
		//获取所有的考试试题
//		List<Questions> list=test.getAllQuestionsBySubject();
//		for(Questions questions:list){
//			System.out.println(questions.getId()+":"+questions.getQuestion()+":"+questions.getRightAnswer());
//		}
		
		Questions questions=test.getQuestionByid(1);
		System.out.println(questions.getRightAnswer());
		
	}



	
	
	
}
