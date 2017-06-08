 package com.xceltech.repositories;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.hibernate.type.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xceltech.model.UserProfile;

@Repository

public class UserProfileRepository {
	@Autowired
	private SessionFactory sessionFactory;

	public void saveuser(UserProfile user) {    //call UserProfile and pass users
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction(); 
		session.save(user);
		tx.commit();

	}

	public List<UserProfile> findByName(String name) {  //call all users from UserProfile when called findByName
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		String sql = "select*from user_profile where name = '" + name + "'";
		SQLQuery sqlQuery = session.createSQLQuery(sql);
		sqlQuery.addEntity(UserProfile.class);
		List<UserProfile> users = sqlQuery.list();
		tx.commit();
		return users;

	}
	
	public void findUser(String name2) {    //call UserProfile and pass users
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		String sql = "select*from user_profile where name = '" + name2 + "'";
		session.find(name2);
		tx.commit();
}
}