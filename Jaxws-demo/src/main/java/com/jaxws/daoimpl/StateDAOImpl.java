package com.jaxws.daoimpl;


import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.jaxws.bo.State;
import com.jaxws.dao.HibernateSession;
import com.jaxws.dao.StateDAO;


public class StateDAOImpl implements StateDAO{
	
	private static final String SELECT_ALL_QUERY = "FROM State";
	@Override
	public List<State> getAllStates() {
		// TODO Auto-generated method stub
		
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		TypedQuery<State> query = session.createQuery(SELECT_ALL_QUERY);
		List<State> list = query.getResultList();
		session.close();
		return list;
	}

}