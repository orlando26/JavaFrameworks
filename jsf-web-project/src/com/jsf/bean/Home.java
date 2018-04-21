package com.jsf.bean;

import java.util.ArrayList;
import java.util.List;

import com.jaxws.ws.User;

public class Home extends Form{

	/**
	 * Home bean
	 */
	private static final long serialVersionUID = -368081216669948324L;
	
	private List<User> users = new ArrayList<User>();

	/**
	 * @return the users
	 */
	public List<User> getUsers() {
		User user1 = new User();
		User user2 = new User();
		
		user1.setName("Orlando");
		user1.setLastName("Loza");
		user1.setAge(24);
		
		user2.setName("Ash");
		user2.setLastName("Ketchum");
		user2.setAge(10);
		
		users.add(user1);
		users.add(user2);
		return users;
	}

	/**
	 * @param users the users to set
	 */
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
}
