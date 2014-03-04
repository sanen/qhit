package com.centrain.hibernate.test.model.twelfth.one;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.centrain.hibernate.model.twelfth.one.GuestUser;
import com.centrain.hibernate.model.twelfth.one.PowerUser;
import com.centrain.hibernate.model.twelfth.one.User;

public class UserTest {

	public static PowerUser PowerUser(){
		//3+2=5
		PowerUser pu=new PowerUser();
		
		pu.setName("poweruser");
		pu.setPassword("oneextend");
		pu.setLevel(1);
		pu.setOtherOfPower("otherOfPower");
		return pu; 
	}
	
	public static GuestUser GuestUser(){
		//3+1
		GuestUser gu=new GuestUser();
		gu.setName("guestuser");
		gu.setPassword("twoextend");
		gu.setOtherOfGuest("otherOfGuest");
		
		return gu;
	}
	
	public static void testOne(){
		// ��ȡsession����ʽ2
		Session session=new Configuration().configure("hibernate.cfg12.xml").buildSessionFactory().openSession();
		
		//Session session=HibernateSessionFactory.getSession();
		
		Transaction tx=null;
		
		try {
			
			//3
			User user=new User();
			//���า�Ǹ���ķ���
			user.setName("zhangsan");
			user.setPassword("123");
			
			tx=session.beginTransaction();		
			
			//��Ӹ���
			session.save(user);
			//�������1
			session.save(PowerUser());
			//�������2
			session.save(GuestUser());
			
			tx.commit();
		}  catch (Exception e) {
			
			if(tx!=null){
				try {
					tx.rollback();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
			e.printStackTrace();
		}
		session.close();
	}
	
	public static void main(String[] args) {
		
		testOne();
	}
}
