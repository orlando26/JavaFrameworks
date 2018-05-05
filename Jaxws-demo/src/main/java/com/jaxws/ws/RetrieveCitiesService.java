package com.jaxws.ws;

import java.util.List;

import javax.jws.WebService;

import com.jaxws.bo.City;

@WebService
public interface RetrieveCitiesService {
	
	public List<City> getAllByState(int id);	
}
