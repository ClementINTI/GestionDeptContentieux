package com.adaming.utils;

import java.util.List;

public interface ServiceGeneric  <T> {

	public void create(T obj);
	
	public void update(T obj);
	
	public void delete (T obj);
	
	public T getById(Class<T> obj, Long id);
	
	public List<T> find(Class<T> obj);

}
