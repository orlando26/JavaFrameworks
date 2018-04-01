
package com.jaxws.ws;

import javax.jws.WebService;

import com.jaxws.bo.City;
import com.jaxws.bo.State;
import com.jaxws.bo.User;
import com.jaxws.dao.UserDAO;
import com.jaxws.daoimpl.UserDAOImpl;

@WebService(endpointInterface = "com.jaxws.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		UserDAO userDao = new UserDAOImpl();
		
		User user = userDao.findUserByEmail(email);
		return user;
	}

//	@Override
//	public User getUser(Integer id, String name, String lastName, String email, Integer age, String address, String state, String city) {
//		// TODO Auto-generated method stub
//		State stateObj = new State();
//		stateObj.setId(1);
//		stateObj.setName(state);
//		
//		City cityObj = new City();
//		cityObj.setId(1);
//		cityObj.setName(city);
//		
//		User user = new User();
//		user.setId(id);
//		user.setName(name);
//		user.setLastName(lastName);
//		user.setEmail(email);
//		user.setAge(age);
//		user.setAddress(address);
//		user.setState(stateObj);
//		user.setCity(cityObj);
//		return user;
//	}
}

