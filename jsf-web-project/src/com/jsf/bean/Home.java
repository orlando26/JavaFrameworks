package com.jsf.bean;

import java.util.ArrayList;
import java.util.List;

import com.jaxws.ws.DeleteUserService;
import com.jaxws.ws.DeleteUserServiceImplService;
import com.jaxws.ws.RetrieveUserService;
import com.jaxws.ws.RetrieveUserServiceImplService;
import com.jaxws.ws.User;
import com.jsf.utils.SessionUtil;

public class Home extends Form{

	/**
	 * Home bean
	 */
	private static final long serialVersionUID = -368081216669948324L;
	
	private List<User> users = new ArrayList<User>();
	
	public Home(){
		RetrieveUserServiceImplService service = new RetrieveUserServiceImplService();
		RetrieveUserService retrieveUser = service.getRetrieveUserServiceImplPort();
		
		users = retrieveUser.getAllUsers();
	}
	
	public void delete(int id){
		System.out.println(id);
		
		DeleteUserServiceImplService service = new DeleteUserServiceImplService();
		DeleteUserService deleteUserService = service.getDeleteUserServiceImplPort();
		
		deleteUserService.deleteUser(id);
		
		RetrieveUserServiceImplService serviceRetrieve = new RetrieveUserServiceImplService();
		RetrieveUserService retrieveUser = serviceRetrieve.getRetrieveUserServiceImplPort();
		
		users = retrieveUser.getAllUsers();
	}
	
	public void update(int id){
		System.out.println(id);
		SessionUtil.setUserId(id);
		System.out.println("redirecting...");
		redirect("/pages/update.xhtml");
	}

	/**
	 * @return the users
	 */
	public List<User> getUsers() {
		return users;
	}
	
	

	/**
	 * @param users the users to set
	 */
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
}
