package com.centrain.hibernate.test.model.twelfth.four;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.centrain.hibernate.model.twelfth.four.IdCard;
import com.centrain.hibernate.model.twelfth.four.People;
import com.centrain.hibernate.model.twelfth.four.Person;
import com.centrain.hibernate.model.twelfth.four.Room;


public class FourTest {

	public static void testsave(){

		Configuration cf=new Configuration().configure("hibernate.cfg4.xml");

		SessionFactory sf=cf.buildSessionFactory();
		
		Session session=sf.openSession();
		
		People people=new People();
		
		Room room=new Room();
		room.setAddress("beijing");
		people.setName("people");
		people.setRoom(room);
		
		Transaction tx=null;
		
		try {
			tx=session.beginTransaction();
			session.save(people);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
	
	public static void testdelete(){
		Configuration cf=new Configuration().configure("hibernate.cfg4.xml");

		SessionFactory sf=cf.buildSessionFactory();
		
		Session session=sf.openSession();

		
		Transaction tx=null;
		
		try {
			tx=session.beginTransaction();
			session.delete(session.get(People.class, (long)1));
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
	
	public static void testIdCard(){
		Configuration cf=new Configuration().configure("hibernate.cfg4.xml");

		SessionFactory sf=cf.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx=null;
		
		try {
			Person  person=new Person();
			person.setId((long)811916);
			person.setName("minggejia");
			
			IdCard idCard=new IdCard();
			
			idCard.setCname("14485254");
			idCard.setPerson(person);
			
			
			tx=session.beginTransaction();
			session.save(idCard);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
	
	
	public static void main(String[] args) {
//		testsave();
//		testdelete();
//		testIdCard();
		
	}
	
}
