package com.jaxws.ws;

import java.util.List;

import javax.jws.WebService;

import com.jaxws.bo.User;
import com.jaxws.dao.UserDAO;
import com.jaxws.daoimpl.UserDAOImpl;

@WebService(endpointInterface = "com.jaxws.ws.RetrieveUserService")
public class RetrieveUserServiceImpl implements RetrieveUserService{

	@Override
	public User getUserByEmail(String email) {
		UserDAO userDao = new UserDAOImpl();
		User user;
		try{
			user = userDao.findUserByEmail(email);
		}catch(IndexOutOfBoundsException e){
			user = null;
		}
		return user;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		UserDAO userDao = new UserDAOImpl();
		
		List<User> users = userDao.getAllUsers();
		return users;
	}

	@Override
	public User getUserById(int id) {
		UserDAO userDao = new UserDAOImpl();
		User user = userDao.findById(id);
		return user;
	}

}
