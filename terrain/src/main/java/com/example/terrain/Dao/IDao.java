package com.example.terrain.Dao;

import java.util.List;

import com.example.terrain.entities.Zone;

public interface IDao<T> {
	T findById(int id);
	List<T> findAll();
	T update(int id,T o);
	void delete(int id);
	T save(T o);
	
}