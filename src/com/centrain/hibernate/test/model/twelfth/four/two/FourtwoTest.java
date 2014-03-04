package com.centrain.hibernate.test.model.twelfth.four.two;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.centrain.hibernate.model.twelfth.oneone.TestAa;
import com.centrain.hibernate.model.twelfth.oneone.TestBb;

/**
 * ʵ��ӳ��֮ һ��һ ˫��ӳ��
 * 
 *
 * �����������ν���ɾ��
 * 
 * }��������������
 * @author aa
 *
 */
public class FourtwoTest {

	
	public static void testFourTwo(){
		
		Session session=new Configuration().configure("hibernate.cfg42.xml").buildSessionFactory().openSession();
		
		Transaction tx=null;
		
		try {
			tx=session.beginTransaction();
			TestAa testAa=new TestAa();
			TestBb testBb=new TestBb();
			testBb.setName("b");
			testAa.setName("a");
			
			testAa.setBb_id(testBb);//TestBb
			
			testBb.setAa_id(testAa);//TestAa
			
			session.save(testAa);
			session.save(testBb);
			tx.commit();
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
	
	public static void main(String[] args) {
		
		
		
	}
}
