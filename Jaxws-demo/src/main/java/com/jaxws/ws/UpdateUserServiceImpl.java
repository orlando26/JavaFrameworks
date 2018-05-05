package com.jaxws.ws;

import javax.jws.WebService;

import com.jaxws.bo.User;
import com.jaxws.dao.UserDAO;
import com.jaxws.daoimpl.UserDAOImpl;

@WebService(endpointInterface = "com.jaxws.ws.UpdateUserService")
public class UpdateUserServiceImpl implements UpdateUserService{

	@Override
	public String updateUser(User user) {
		UserDAO userDao = new UserDAOImpl();
		try{
			userDao.updateUser(user);
			return "Success!";
		}catch (Exception e) {
			return "error updating the user: " + e.getMessage();
		}
	}

}
