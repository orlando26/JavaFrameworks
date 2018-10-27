package com.orlando.ws;

import java.util.List;

import javax.jws.WebService;

import com.orlando.loginDao.model.State;

@WebService
public interface RetrieveStatesService {
	
	public List<State> getAllStates();

}
