package com.jaxws.ws;

import javax.jws.WebService;

import com.jaxws.bo.User;

@WebService
public interface UpdateUserService {
	
	public String updateUser(User user);
	
}
