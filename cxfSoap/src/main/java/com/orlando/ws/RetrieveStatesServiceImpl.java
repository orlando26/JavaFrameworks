package com.orlando.ws;

import java.util.List;

import com.orlando.loginDao.dao.StateDAO;
import com.orlando.loginDao.daoImpl.StateDAOImpl;
import com.orlando.loginDao.model.State;

public class RetrieveStatesServiceImpl implements RetrieveStatesService{

	@Override
	public List<State> getAllStates() {
		StateDAO stateDao = new StateDAOImpl();
		List<State> states = stateDao.getAllStates();
		return states;
	}
	
	

}
