package com.jaxws.dao;

import com.jaxws.bo.User;

public interface UserDAO {
	
	public void insert(User user);
	
	public User findUserByEmail(String email);
	
	public void delete(User user);

}