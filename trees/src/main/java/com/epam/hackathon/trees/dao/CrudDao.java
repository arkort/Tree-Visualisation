package com.epam.hackathon.trees.dao;

public interface CrudDao<T> {

	public T create(T t);

	public void update(T t);

	public T get(String id, Class<T> entityClass);

	public void remove(T t);
}
