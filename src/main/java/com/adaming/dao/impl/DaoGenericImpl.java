package com.adaming.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.adaming.utils.DaoGeneric;
@Repository("daoGen")
public class DaoGenericImpl <T> implements DaoGeneric <T> {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void create(T obj) {
Session session = this.sessionFactory.getCurrentSession();
session.save(obj);
	}

	public void update(T obj) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(obj);
	}

	public void delete(T obj) {
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(obj);		
	}

	public T getById(Class<T> obj, Long id) {
		Session session = this.sessionFactory.getCurrentSession();
		return (T) session.get(obj, id);
		
	}

	public List<T> find(Class<T> obj) {
		Session session = this.sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(obj);
		return crit.list();
		
	}
}
