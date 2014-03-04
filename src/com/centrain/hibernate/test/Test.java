package com.centrain.hibernate.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.centrain.hibernate.dao.UserDAO;

import com.centrain.hibernate.dao.impl.UserDaoHibImpl;
import com.centrain.hibernate.model.Person;
import com.centrain.hibernate.model.User;

public class Test {

    static UserDAO userdao=new UserDaoHibImpl();
   
 	
    public static  void adduser(User user){
		userdao.insert(user);
	}
   
	public static User selectByid(int id){
		User user=userdao.selectByid(id);
		return user;
	}  
	
	public static void update(int id){

		User user=selectByid(id);
		user.setName("秦甜");
		userdao.update(user);
	}
	
	public static void delete(int id){
		userdao.delete(id);
	}
	
	public static List<User> selectall(String User){
		List<User> list=userdao.selectAll(User);
		return list;
	}
	
	public static void user(){
		//添加
		User user=new User();
		user.setName("天心");
		user.setAge(20);
		Test.adduser(user);

		//查询 单个信息		
//		User user=Test.selectByid(4);
//		System.out.println(user.getId()+":"+user.getName()+":"+user.getAge());
		
//		修改   
//		Test.update(4);
//		User user2=Test.selectByid(4);
//		System.out.println(user2.getId()+":"+user2.getName()+":"+user2.getAge());
		
//		删除
//		Test.delete(1);
		
		
//		查询所有
//		List<Student> list=studao.selectAll("Student");
//		for(Student u:list){
//			System.out.println(u.getId()+"=="+u.getChineseMarks()+"=="+u.getId());
//		}
	    
	}
	
	/**
	 * 带where条件查询语句
	 * 
	 */
	@SuppressWarnings("unchecked")
	public static void whereSelect(){
		
		Configuration cf=new Configuration().configure();
		
		SessionFactory sessionFactory=cf.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		int id=1;
		Query query=session.createQuery("from Person as s "+"where s.id="+id);
		
		List<Person> list=query.list();
		
		for (int i = 0; i <list.size(); i++) {
			Person person=(Person)list.get(i);
			System.out.println(person.getUsername()+"|"+person.getId()+"|"+person.getPasswrod()+"<br>");
		}
		tx.commit();
		session.close();
	}
	
	public static void main(String[] args) {

		//		带where条件查询语句

		//		whereSelect();
		
		//		user();
	}
}
