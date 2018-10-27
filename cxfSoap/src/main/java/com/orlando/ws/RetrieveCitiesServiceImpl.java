package com.orlando.ws;

import java.util.List;

import com.orlando.loginDao.dao.CityDAO;
import com.orlando.loginDao.daoImpl.CityDAOImpl;
import com.orlando.loginDao.model.City;

public class RetrieveCitiesServiceImpl implements RetrieveCitiesService{

	@Override
	public List<City> findAllByState(int stateId) {
		CityDAO cityDao = new CityDAOImpl();
		List<City> cities = cityDao.findAllByStateId(stateId);
		return cities;
	}

}
