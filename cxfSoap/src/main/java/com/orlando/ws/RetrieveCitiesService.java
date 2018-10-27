package com.orlando.ws;

import java.util.List;

import javax.jws.WebService;

import com.orlando.loginDao.model.City;

@WebService
public interface RetrieveCitiesService {
	
	public List<City> findAllByState(int stateId);
	
}
