package com.jaxws.ws;

import java.util.List;

import javax.jws.WebService;

import com.jaxws.bo.State;

@WebService
public interface RetrieveStatesService {

	public List<State> getAll();
		
}
