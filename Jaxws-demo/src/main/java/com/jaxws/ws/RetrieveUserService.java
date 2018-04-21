package com.jaxws.ws;

import java.util.List;

import javax.jws.WebService;

import com.jaxws.bo.User;

@WebService
public interface RetrieveUserService {
	
	User getUserByEmail(String email);
	
	List<User> getAllUsers();
}
