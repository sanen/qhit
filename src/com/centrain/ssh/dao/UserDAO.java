package com.centrain.ssh.dao;

import java.util.List;

import com.centrain.ssh.orm.User;

public interface UserDAO {

	/**
	 * 1 ����û�
	 * @param user
	 * @return
	 */
	public boolean addUser(User user);
	
	
	/**
	 * 2 ɾ����û�
	 * @param id
	 * @return
	 */
	public boolean deleteUser(int id);
	
	/**
	 * 3 �޸��û�
	 * @param user
	 * @return
	 */
	public boolean udpateUser(User user);
	
	/**
	 * 4 ��ȡ�����û���Ϣ
	 * @param id
	 * @return
	 */
	public User getUserById(int id);
	
	/**
	 * 5 ��ȡ���е��û���Ϣ
	 * @return
	 */
	public List<User> getUsers();
	
	/**
	 * 6 ��ҳ��ѯ�����е��û���Ϣ
	 * @param pageid
	 * @param pagesize
	 * @return
	 */
	public List<User> getUsersByFenYe(int pageid,int pagesize);
	
	
	
}
