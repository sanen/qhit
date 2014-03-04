package com.centrain.hibernate.test.model.twelfth.three;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import com.centrain.hibernate.HibernateSessionFactory;
import com.centrain.hibernate.model.twelfth.three.Customer;
import com.centrain.hibernate.model.twelfth.three.Customer2;

import com.centrain.hibernate.model.twelfth.three.Order;
import com.centrain.hibernate.model.twelfth.three.Order2;


public class CustomerOrderTest {

	/**
	 *  many-to-one
	 * ���� һ�Զ� �����Կͻ� 
	 * 
	 * ��Ӷ���ʱͬʱ���������Ӧ�Ŀͻ�
	 * 
	 */
	public static void Customer(){
		
		Configuration cf=new Configuration().configure("hibernate.cfg3.xml");

		SessionFactory sf=cf.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Customer customer=new Customer("zhangsan","beijing");//3l
		
		Order order=new Order("2",customer);
		
		Transaction tx=null;
		
		try {
			tx=session.beginTransaction();
			session.save(order);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
	
	
	
	
	/**
	 * �ͻ��Զ��� һ�Զ�  one-to-many  ˫��
	 * 
	 * ��ָ���Ŀͻ� ��Ӷ���
	 * 
	 * Ҳ������Ӷ���ʱ�� ��Ӷ���ͬʱ�����ӿͻ�
	 * 
 	 */
	public static void addorder(){
		
		Configuration cf=new Configuration().configure("hibernate.cfg3.xml");

		SessionFactory sf=cf.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Order2 order=new Order2("18",(Customer2)session.get(Customer2.class, (long)1));
				
		Transaction tx=null;
		
		try {
			tx=session.beginTransaction();

			/*��Ӷ���*/
			session.save(order);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		
	}
	
	/**
	 * when insert customer also insert this customer's orders
	 * that it is one or many.(it=insert orders)
	 * 
	 * ��ӿͻ�ʱ ����ͬʱ��˿ͻ������ض�����ע��˶�����������ɣ� ��ͨ������ �����������
	 * 
	 * 
	 */
	public static void addCustomerAndtoaddOrder(){
		
		Configuration cf=new Configuration().configure("hibernate.cfg4.xml");

		SessionFactory sf=cf.buildSessionFactory();
		
		Session session=sf.openSession();
				
		Transaction tx=null;
		
		try {
			
			
			Customer2 customer=new Customer2();
			customer.setAddress("����");
			customer.setName("��˹��");
			
			Set<Order2> set=new HashSet<Order2>();
			
			Order2 order2=new Order2("3",customer);
			Order2 order22=new Order2("4",customer);
			
			set.add(order2);
			set.add(order22);
			/*��ӿͻ�*/
			customer.setOrders(set);
			
			
			tx=session.beginTransaction();
			session.save(customer);

			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
	
	
	/**
	 * 
	 * ��ȡָ���ͻ������ж�����Ϣ
	 * 
	 */
	public static void getCustomer(){
		Configuration cf=new Configuration().configure("hibernate.cfg3.xml");

		SessionFactory sf=cf.buildSessionFactory();
		
		Session session=sf.openSession();
		
		
		Transaction tx=null;
		
		try {
			tx=session.beginTransaction();
			Customer2 customer2=(Customer2)session.get(Customer2.class, (long)1);
			
			Set<Order2> set=customer2.getOrders();
			
			for(Order2  order2:set){
				System.out.println(order2.getId()+":"+order2.getOrderNumber());
			}
			tx.commit();
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
	
	
	public static void main(String[] args) {
		
//		addorder();
		
//		getCustomer();
		Customer();
		
//		addCustomerAndtoaddOrder();
		
		
		
	}
}
