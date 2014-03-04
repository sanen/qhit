package com.centrain.hibernate.service.studentexam;

import java.util.List;

import com.centrain.hibernate.model.studentexam.Users;


public interface UsersService {

	/** 1
	 * ����û� ע��
	 * @param users
	 * @return true ��ӳɹ���֮ʧ��
	 */
	public boolean addUsers(Users users);
	
	/** 2
	 * ɾ����û�
	 * @param id
	 * @return trueɾ��ɹ� ��֮ʧ��
	 */
	public boolean deleteUsers(int id);
	
	/** 3
	 * �޸��û�����
	 * @param users
	 * @return true �޸ĳɹ���֮ʧ��
	 */
	public boolean updatePassword(Users users);
	
	
	/** 4
	 * ��ȡ���е��û���Ϣ
	 * @return
	 */
	public List<Users> getALlUsers();
	
	/** 5
	 * �����ͬ�û�����û��Ƿ����
	 * @param username
	 * @return
	 */
	public boolean checkUsersExist(String username);
	
	/** 6
	 * �û���¼
	 * 1 Ҫ�жϴ��û��Ƿ����
	 * 2 ����ȡ���û����û�����
	 * 0 ���Ϸ���¼
	 * 1 �Ϸ���¼ �����
	 * 2 �Ϸ���¼ ����Ա����
	 */
	public Users userLogin(Users users);
	
	/** 7
	 * ��ȡ�����û�����Ϣ
	 * �޸��û�ǰ���û���Ϣ
	 */
	public Users getUserById(int id);
	
	
}
