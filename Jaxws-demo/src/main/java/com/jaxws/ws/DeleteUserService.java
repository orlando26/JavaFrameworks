package com.jaxws.ws;

import javax.jws.WebService;

@WebService
public interface DeleteUserService {
	
	public String deleteUser(int id);
	
}
