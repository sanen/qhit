package com.centrain.hibernate.dao.studentexam.impl;

import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.centrain.hibernate.dao.studentexam.SubjectDAO;
import com.centrain.hibernate.model.studentexam.Questions;
import com.centrain.hibernate.model.studentexam.Subject;
import com.centrain.hibernate.model.studentexam.SubjectType;
import com.centrain.hibernate.dao.impl.BaseDAO;


public class SubjectDAOHibImpl extends BaseDAO implements SubjectDAO {
	
	private final String hibernateCfgXmlName="hibernate.studentexam.cfg.xml";
	/** 1
	 * @param subject
	 * @return  
	 */
	public boolean addSubject(Subject subject) {
		if(!checkSubjectExist(subject)){
			return super.insertBoolean(subject,hibernateCfgXmlName);
		}
		return false;
	}
	
	/** 2
	 * @param subject
	 */
	public boolean checkSubjectExist(Subject subject) {
		Session session=new Configuration().configure(hibernateCfgXmlName).buildSessionFactory().openSession();
		try {
			Query query=session.createQuery("from Subject where subject=?");
			query.setString(0, subject.getSubject());
			if(query.list().size()>0){
				return true;
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		return false;
	}

	/** 3
	 * @param id
	 * @return
	 */
	public boolean deleteSubject(int id) {
		return super.deleteBoolean(Subject.class, id,hibernateCfgXmlName);
	}

	/** 4
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Subject> getALlSubject() {
		return (List<Subject>) super.getAll("Subject",hibernateCfgXmlName);
	}

	/** 5
	 */
	@SuppressWarnings("unchecked")
	public Set<Questions> getQuestionsBySubjectByid(int subject_id) {
		String hql="from Subject where id=?";
		Session session=new Configuration().configure(hibernateCfgXmlName).buildSessionFactory().openSession();
		 
		List<Subject> list=session.createQuery(hql).setInteger(0, subject_id).list();
		
		for(Subject subject:list){
			//System.out.println(subject.getSubject());
			Set<Questions> set=subject.getQuestions();
			return set;
		}
		session.close();
		return null;
	}

	/**
	 */
	@SuppressWarnings("unchecked") 
	public List<Subject> getSubjectBySubjectTypeByid(int subjectType_id) {
		String hql="from SubjectType where id=?";
		Session session=new Configuration().configure(hibernateCfgXmlName).buildSessionFactory().openSession();
		
		List<SubjectType> list=session.createQuery(hql).setInteger(0, subjectType_id).list();
		
		for(SubjectType subjectType:list){ 
			//System.out.println(subject.getSubject());
			List<Subject> set=subjectType.getSubject();
			return set;
		}
		session.close();
		return null;
	}

	/**
	 * ok
	 */
//	public static void main(String[] args) {
//		SubjectDAOHibImpl test=new SubjectDAOHibImpl();
//		test.getSubjectBySubjectTypeByid(2);
//	}
}
