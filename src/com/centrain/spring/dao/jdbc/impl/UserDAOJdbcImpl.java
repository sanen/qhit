package com.centrain.spring.dao.jdbc.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowCallbackHandler;

import com.centrain.hibernate.spring.model.sixteen.User;
import com.centrain.spring.dao.UserDAO;


public class UserDAOJdbcImpl implements UserDAO {

	DataSource ds=null;
	JdbcTemplate jt=null;
	/** 
	 * Spring设置数据源?
	 * @param ds
	 */
	public void setDs(DataSource ds) {
		this.ds = ds;
	}  
 
	public void init(){
		jt=new JdbcTemplate(ds);
	}
	 
	/**
	 * 增删改? 均使用 JdbcTemplate的update 方法
	 * 查?    使用 JdbcTemplate的query 方法
	 */
	
	public boolean deleteUser(int id) {
		final int deleteid=id;
		String sql="delete spring_user where id=?";
		int result=jt.update(sql, new PreparedStatementSetter(){
			public void setValues(PreparedStatement pst) throws SQLException {
				pst.setInt(1, deleteid);
			}
		});
		if(result>0){
			return true;
		}
		return false;
	}

	public List<User> getQuery() {
		String sql="select *from spring_user";
		final List<User> list=new ArrayList<User>();
		jt.query(sql,new RowCallbackHandler(){
			public void processRow(ResultSet rs) throws SQLException {
				User user=new User();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				list.add(user);
			}
		});
		return list;
	}

	public User getUserById(int id) {
		String sql="seletc * from spring_user where id=?";
		final int byid=id;
		final User user=new User();
		jt.query(sql, new PreparedStatementSetter(){
			public void setValues(PreparedStatement pst) throws SQLException {
				pst.setInt(1, byid);
			}
		},new RowCallbackHandler(){
			public void processRow(ResultSet rs) throws SQLException {
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
			}
		});
		return user;
	}

	public boolean insertUser(User user) {
		
		String sql="insert into spring_user(username) values(?)";
		final String username=user.getUsername();
		int result=jt.update(sql, new PreparedStatementSetter(){
			public void setValues(PreparedStatement pst) throws SQLException {
				pst.setString(1, username);
			}
		});
		if(result>0){
			return true;
		}
		return false;
	}

	public boolean updateUser(User user) {
		String sql="update t_user set username=? where id=?";
		final String username=user.getUsername();
		final int id=user.getId();
		int result=jt.update(sql, new PreparedStatementSetter(){
			public void setValues(PreparedStatement pst) throws SQLException {
				pst.setString(1, username);
				pst.setInt(2, id);
			} 
		}); 
		if(result>0){
			return true;
		}
		return false;
	}

}
