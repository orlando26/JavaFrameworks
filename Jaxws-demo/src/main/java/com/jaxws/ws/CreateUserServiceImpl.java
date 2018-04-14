package com.jaxws.ws;

import javax.jws.WebService;

import com.jaxws.bo.User;
import com.jaxws.dao.UserDAO;
import com.jaxws.daoimpl.UserDAOImpl;
import com.jaxws.util.UtilFunctions;

@WebService(endpointInterface = "com.jaxws.ws.CreateUserService")
public class CreateUserServiceImpl implements CreateUserService{

	@Override
	public String insertUser(User user) {
		try{
			String hashedPassword = UtilFunctions.hash(user.getPassword());
			user.setPassword(hashedPassword);
			UserDAO userDao = new UserDAOImpl();
			userDao.insert(user);
		}catch(Exception e){
			return "Error inserting user";
		}
		
		return "Success!";
	}

}
