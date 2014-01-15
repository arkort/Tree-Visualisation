package com.epam.hackathon.trees.dao.impl;

import javax.annotation.Resource;

import org.springframework.data.mongodb.core.MongoOperations;

import com.epam.hackathon.trees.dao.CrudDao;

public class CrudDaoImpl<T> implements CrudDao<T> {

	@Resource
	MongoOperations mongoOperation;

	
	public T create(T t) {
		mongoOperation.save(t);
		return t;
	}

	
	public void update(T t) {
		mongoOperation.save(t);
	}


	public T get(String id, Class<T> entityClass) {
		return mongoOperation.findById(id, entityClass);
	}


	public void remove(T t) {
		mongoOperation.remove(t);
	}
}
