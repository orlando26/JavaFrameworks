package com.jaxws.ws;

import javax.jws.WebService;

import com.jaxws.bo.User;

@WebService
public interface CreateUserService {
	public String insertUser(User user);
}
