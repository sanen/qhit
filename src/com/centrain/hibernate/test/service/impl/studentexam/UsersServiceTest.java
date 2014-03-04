package com.centrain.hibernate.test.service.impl.studentexam;

import java.util.List;

import com.centrain.hibernate.model.studentexam.Users;
import com.centrain.hibernate.service.studentexam.UsersService;
import com.centrain.hibernate.service.studentexam.impl.UsersServiceImpl;

public class UsersServiceTest implements UsersService{

	
	
	UsersService usersService=new UsersServiceImpl();
	/** 1
	 * ����û� ע��
	 * @param users
	 * @return true ��ӳɹ���֮ʧ��
	 */
	public boolean addUsers(Users users){
		
		return usersService.addUsers(users);
	}
	
	/** 2
	 * ɾ����û�
	 * @param id
	 * @return true ɾ��ɹ� ��֮ʧ��
	 */
	public boolean deleteUsers(int id){
		return usersService.deleteUsers(id);
	}
	
	/** 3
	 * �޸��û�����
	 * @param users
	 * @return  true �޸ĳɹ���֮ʧ��
	 */ 
	public boolean updatePassword(Users users){
		return usersService.updatePassword(users);
	}
	
	
	/** 4
	 * ��ȡ���е��û���Ϣ
	 * @return
	 */
	public List<Users> getALlUsers(){
		return usersService.getALlUsers();
	}
	
	
	/** 5
	 * �����ͬ�û�����û��Ƿ����
	 * @param username
	 * @return
	 */
	public boolean checkUsersExist(String username){
		return usersService.checkUsersExist(username);
	}
	
	/** 6
	 * �û���¼
	 * null ���Ϸ���¼
	 * users.getIsmanager()=0 �Ϸ���¼ �����
	 * users.getIsmanager()=1 �Ϸ���¼ ����Ա����
	 */
	public Users userLogin(Users users){
	
		return usersService.userLogin(users);	
	}
	
	/** 7 �޸��û�����
	 * ��ȡ�����û�����Ϣ
	 * �޸��û�ǰ���û���Ϣ
	 */
	public Users getUserById(int id) {
		return usersService.getUserById(id);
	}
	
	public static void main(String[] args) {
		
		UsersServiceTest test=new UsersServiceTest();
		
		//1 ����û�
		Users users=new Users();
		users.setUsername("admin");
		users.setIsmanager(1);//����Ա
		users.setPassword("admin");
		test.addUsers(users);
		
		//2  ɾ���û�
//		System.out.println(test.deleteUsers(3));
		
		//3 �޸��û�����
//		Users users=new Users();
//		users.setId(1);
//		users.setPassword("as");
//		users.setUsername("as");
//		test.updatePassword(users);
		
		//4 ��ȡ���е��û���Ϣ
//		List<Users> list=test.getALlUsers();
//		for(Users user:list){
//			System.out.println(user.getId()+":"+user.getUsername());
//		}
		
		//5 �����ͬ�û�����û��Ƿ����
//		System.out.println(test.checkUsersExist("admin"));
		
		//6 �û���¼
//		Users users=new Users();
//		users.setUsername("admin");
//		users.setPassword("admin");
//		Users user=test.userLogin(users);
//		System.out.println(user.getIsmanager());
		
		//7 �޸��û�����
//		Users users=test.getUserById(2);
//		users.setPassword("aaas");
//		System.out.println(test.updatePassword(users));
		
	}

	
	
}
