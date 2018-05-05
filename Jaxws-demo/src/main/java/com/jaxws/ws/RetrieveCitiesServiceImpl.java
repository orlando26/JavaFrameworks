package com.jaxws.ws;

import java.util.List;

import javax.jws.WebService;

import com.jaxws.bo.City;
import com.jaxws.dao.CityDAO;
import com.jaxws.daoimpl.CityDAOImpl;

@WebService(endpointInterface = "com.jaxws.ws.RetrieveCitiesService")
public class RetrieveCitiesServiceImpl implements RetrieveCitiesService{

	@Override
	public List<City> getAllByState(int id) {
		CityDAO cityDao = new CityDAOImpl();
		List<City> cities = cityDao.findAllByStateId(id);
		return cities;
	}

}
