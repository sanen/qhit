package com.centrain.hibernate.center.thirteenth.lock;

import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.centrain.hibernate.center.thirteenth.lock.Acount;
import com.centrain.hibernate.center.thirteenth.lock.Person;

 

public class Test {


	//������ 
	public void save(){ 
		  
		Session session = new Configuration().configure("hibernate.cfg13.xml").buildSessionFactory().openSession();
		Person p = new Person();
		p.setName("zhangsan");
		p.setMoney(50);
		Acount acount = new Acount();
		acount.setMoney(100);
		acount.setPerson(p);
		session.save(acount);
		session.beginTransaction().commit();
				
	}
	
	/*
	 * �����������һ
	 * 
	 */
	public void unUseLock(){
		
	   
		Session session = new Configuration().configure("hibernate.cfg13.xml").buildSessionFactory().openSession();
	    
		Acount ac = (Acount)session.get(Acount.class,1);//,LockMode.UPGRADE);
		System.out.println("***************");
		
		System.out.println(ac.getMoney());//��ȷֵ100   ����ֵ����ɺ�Acount��money=250
		  
		ac.setMoney(ac.getMoney()+60);//+50
		
		testLock(); 
		System.out.println("###############");
	    
		session.beginTransaction().commit();
		
		session.update(ac);
		
		session.close();
	}
	
	/**
	 * ������
	 * 
	 * �����ֲ������� ���ڱ�����4˵�� �˲��������ִ��
	 */
	
	public void useBeiGuanLock(){
		
		   
		Session session =   new Configuration().configure("hibernate.cfg13.xml").buildSessionFactory().openSession();
	    
		Acount ac = (Acount)session.get(Acount.class,1,LockMode.UPGRADE);
		System.out.println("***************");
		ac.setMoney(ac.getMoney()+50);
		testLock();
		System.out.println("###############");
	    System.out.println(ac.getMoney());//��ȷֵ100   ����ֵ����ɺ� Acount��money=250

	    session.beginTransaction().commit();
		session.close();
		
	}
	/**
	 * ������������
	 */
	public void testLock(){
		
		Session session1 =   new Configuration().configure("hibernate.cfg13.xml").buildSessionFactory().openSession();
	    Acount ac1=(Acount)session1.get(Acount.class,1);
	    ac1.setMoney(ac1.getMoney()+50);//+50
		session1.update(ac1); 
		session1.beginTransaction().commit();
		session1.close();
		   
	}
	
	public static void main(String[] args) {
		   
		new Test().save(); 
		
//		new Test().unUseLock();
		
//		new Test().useBeiGuanLock();
		
	}
} 
