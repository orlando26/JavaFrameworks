package com.jaxws.ws;

import java.util.List;

import javax.jws.WebService;

import com.jaxws.bo.State;
import com.jaxws.dao.StateDAO;
import com.jaxws.daoimpl.StateDAOImpl;

@WebService(endpointInterface = "com.jaxws.ws.RetrieveStatesService")
public class RetrieveStatesServiceImpl implements RetrieveStatesService{

	@Override
	public List<State> getAll() {
		StateDAO stateDao = new StateDAOImpl();
		List<State> states = stateDao.getAllStates();
		return states;
	}

}
