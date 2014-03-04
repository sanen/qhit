package com.centrain.hibernate.center.thirteenth.cache.test;

import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.centrain.hibernate.center.thirteenth.cache.Account;
import com.centrain.hibernate.center.thirteenth.cache.Account1;

public class AccountTest {
	
	private SessionFactory sf = new Configuration().configure("hibernate.cfg132.xml").buildSessionFactory() ;

	/**
	 * 悲观锁
	 */
	public void test1(){
		Session session1  = sf.openSession();
		Session session2  = sf.openSession();
		
		Account a = (Account)session1.get(Account.class,1,LockMode.UPGRADE) ;
		a.setBalance(a.getBalance() + 10) ;
		
		System.out.println("--------前-------------");
		session2.update(a) ;
		session2.beginTransaction().commit() ;
		session2.close() ;
		System.out.println("--------后-------------");
		
		session1.close() ;
	}
	
	public void saveAccount1(){
		Session session = sf.openSession() ;
		Account1 a = new Account1() ;
		a.setBalance(100) ;
		session.save(a) ;
		session.beginTransaction().commit() ;
		session.close() ;
	}
	
	/**
	 * 乐观锁
	 */
	public void test2(){
		Session session1  = sf.openSession();
		Session session2  = sf.openSession();
		
		Account1 a = (Account1)session1.get(Account1.class,1) ;
		a.setBalance(a.getBalance() + 10) ;
		
		System.out.println(a.getVersion());
		session2.update(a) ;
		session2.beginTransaction().commit() ;
		session2.close() ;
		System.out.println(a.getVersion());
		session1.update(a) ;
		session1.beginTransaction().commit() ;
		session1.close() ;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		new AccountTest().test1() ;
//		new AccountTest().saveAccount1() ;
//		new AccountTest().test2() ;
		
	}

}
