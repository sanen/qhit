package com.centrain.hibernate.test.model.twelfth.two;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.centrain.hibernate.HibernateSessionFactory;
import com.centrain.hibernate.model.twelfth.two.Book;
import com.centrain.hibernate.model.twelfth.two.GoodBook;
import com.centrain.hibernate.model.twelfth.two.NewBook;
/**
 * �̳�ӳ��
 * @author aa
 *
 */
public class BookTest {

	public static Book book(){
		
		
		Book book=new Book();
		
		book.setTitle("zhongguo");
		book.setAuthor("shiming");
		book.setPrice(45);
		return book;
		
		
	}
	
	public static GoodBook goodBook(){
		
		GoodBook goodBook=new GoodBook();
		goodBook.setTitle("goodbook");
		goodBook.setAuthor("zhangkehua");
		goodBook.setPrice(60);
		goodBook.setCountry("�й�");
		goodBook.setNumber(50);
		
		return goodBook;
	}
	
	
	public static NewBook newBook(){
		NewBook newBook=new NewBook();
		newBook.setTitle("newbook");
		newBook.setAuthor("lisi");
		newBook.setPrice(40);
		newBook.setBorrowStatus("���");
		return newBook;
	}
	
	/**
	 * ����ͬ��
	 * 
	 */
	public static void testone(){
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=null;
		tx=session.beginTransaction();
		
		Book book=book();
		session.save(book);
		
		GoodBook goodBook=goodBook();
		session.save(goodBook);
		
		NewBook newBook=newBook();
		session.save(newBook);
		
		tx.commit();
		session.close();
		book();
	}
	  
	/**
	 * �������Ϊһ��
	 */
	public static void testtwo(){
		Session session=new Configuration().configure("hibernate.cfg12.xml").buildSessionFactory().openSession();
		Transaction tx=null;
		tx=session.beginTransaction();
		
		Book book=book();
		session.save(book);
		
		GoodBook goodBook=goodBook();
		session.save(goodBook);
		
		NewBook newBook=newBook();
		session.save(newBook);
		
		tx.commit();
		session.close();
		book();
	}
	
	public static void main(String[] args) {
		testtwo();
		
	}
	
}
