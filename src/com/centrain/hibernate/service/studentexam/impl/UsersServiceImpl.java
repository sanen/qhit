package com.centrain.hibernate.service.studentexam.impl;

import java.util.List;

import com.centrain.hibernate.dao.studentexam.UsersDAO;
import com.centrain.hibernate.dao.studentexam.impl.UsersDAOHibImpl;
import com.centrain.hibernate.model.studentexam.Users;
import com.centrain.hibernate.service.studentexam.UsersService;

public class UsersServiceImpl implements UsersService {

    UsersDAO usersDAO=new UsersDAOHibImpl();
    
	/** 1
	 * ����û� ע��
	 * @param users
	 * @return
	 */
	public boolean addUsers(Users users) {
		return usersDAO.addUsers(users);
	}
	
	/** 2
	 * ɾ����û�
	 * @param id
	 * @return true ɾ��ɹ� ��֮ʧ��
	 */
	public boolean deleteUsers(int id) {
		return usersDAO.deleteUsers(id);
	}
	
	/** 3 
	 * �޸��û�����
	 * @param users
	 * @return
	 */
	public boolean updatePassword(Users users) {
		return usersDAO.updatePassword(users);
	}
	
	/** 4
	 * ��ȡ���е��û���Ϣ
	 * @return
	 */
	public List<Users> getALlUsers() {
		return usersDAO.getALlUsers();
	}
	 
	/** 5
	 * �����ͬ�û�����û��Ƿ����
	 * @param username
	 * @return
	 */
	public boolean checkUsersExist(String username) {
		return usersDAO.checkUsersExist(username);
	}

	/** 6
	 * �û���¼
	 * null ���Ϸ���¼
	 * users.getIsmanager()=0 �Ϸ���¼ �����
	 * users.getIsmanager()=1 �Ϸ���¼ ����Ա����
	 */
	public Users userLogin(Users users) {
		return usersDAO.userLogin(users);
	}
	
	/** 7
	 * ��ȡ�����û�����Ϣ
	 * �޸��û�ǰ���û���Ϣ
	 */
	public Users getUserById(int id) {
		return usersDAO.getUserById(id);
	}


}
