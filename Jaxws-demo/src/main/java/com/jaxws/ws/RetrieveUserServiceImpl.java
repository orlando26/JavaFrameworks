package com.jaxws.ws;

import javax.jws.WebService;

import com.jaxws.bo.User;
import com.jaxws.dao.UserDAO;
import com.jaxws.daoimpl.UserDAOImpl;

@WebService(endpointInterface = "com.jaxws.ws.RetrieveUserService")
public class RetrieveUserServiceImpl implements RetrieveUserService{

	@Override
	public User getUserByEmail(String email) {
		UserDAO userDao = new UserDAOImpl();

		User user = userDao.findUserByEmail(email);
		return user;
	}

}
