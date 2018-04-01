package com.jaxws.dao;

import java.util.List;

import com.jaxws.bo.City;

public interface CityDAO{
	
	public List<City> findAllByStateId(int stateId);
}
