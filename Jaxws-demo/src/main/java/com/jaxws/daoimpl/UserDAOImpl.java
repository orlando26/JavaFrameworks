package com.jaxws.daoimpl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.jaxws.bo.User;
import com.jaxws.dao.HibernateSession;
import com.jaxws.dao.UserDAO;

public class UserDAOImpl implements UserDAO{

	
	
	private static final String FIND_BY_EMAIL = "FROM User where Email = :email";
	
	private static final String GET_ALL_USERS = "FROM User";
	
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
	public List<User> getAllUsers() {
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		TypedQuery<User> query = session.createQuery(GET_ALL_USERS);
		List<User> list = query.getResultList();
		session.close();
		return list;
	}



	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		User user = (User) HibernateSession.getObjectByPrimaryKey(User.class, id);
		return user;
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		HibernateSession.deleteObject(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		HibernateSession.updateObject(user);
	}



}