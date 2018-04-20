package com.jaxws.dao;

import java.util.List;

import com.jaxws.bo.User;

public interface UserDAO {

	public void insert(User user);

	public User findUserByEmail(String email);

	public void delete(User user);

	public List<User> getAllUsers();

	public void updateUser(User user);

	public User findById(int id);
	

}