package com.jaxws.daoimpl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.jaxws.bo.User;
import com.jaxws.dao.HibernateSession;
import com.jaxws.dao.UserDAO;

public class UserDAOImpl implements UserDAO{

	private static final String INSERT_QUERY =
			"INSERT INTO USER (Id, Name, Last_Name, Email, Age, Address, Password) VALUES (NULL, ?, ?, ?, ?, ?, ?)";
	
	private static final String FIND_BY_EMAIL = "FROM User where Email = :email";
	
	@Override
	public void insert(User user) {
		HibernateSession.saveObject(user);
	}

	@Override
	public User findUserByEmail(String email) {
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		TypedQuery<User> query = session.createQuery(FIND_BY_EMAIL);
		query.setParameter("email", email);
		List<User> list = query.getResultList();
		session.close();
		return list.get(0);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}


}