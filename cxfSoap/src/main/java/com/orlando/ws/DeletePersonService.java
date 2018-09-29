package com.orlando.ws;

import javax.jws.WebService;

@WebService
public interface DeletePersonService {
	
	public String deletePerson(int id);
	
}
