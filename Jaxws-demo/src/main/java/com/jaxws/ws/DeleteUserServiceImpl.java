package com.jaxws.ws;


import javax.jws.WebService;

import com.jaxws.bo.User;
import com.jaxws.dao.UserDAO;
import com.jaxws.daoimpl.UserDAOImpl;

@WebService(endpointInterface = "com.jaxws.ws.DeleteUserService")
public class DeleteUserServiceImpl implements DeleteUserService{

	@Override
	public String deleteUser(int id) {
		UserDAO userDao = new UserDAOImpl();
		
		User user = userDao.findById(id);
		try{
			userDao.delete(user);
		}catch (Exception e) {
			System.out.println("Error deleting the user: " + e.getMessage());;
		}
		return "User " + user.getEmail() + " deleted.";
	}

}
