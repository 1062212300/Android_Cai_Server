package net.onest.server.service;


import java.util.List;

import net.onest.server.entity.User;

public interface UserService {
	//登录查询
	public User findUserByUserNameAndPassword(User u);
	//注册查询
	public User findUserByAccount(String account);
	//注册
	public int insertUser(User u);
	
	public List<User> findAllUsers();

	public void delete(User user);
}
