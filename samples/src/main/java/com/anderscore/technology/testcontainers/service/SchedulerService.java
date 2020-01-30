package com.anderscore.technology.testcontainers.service;

import java.util.List;
import java.util.Optional;

import com.anderscore.technology.testcontainers.data.Scheduler;

public interface SchedulerService {
	
	void store(Scheduler scheduler);
	
	Optional<Scheduler> find(long id);
	
	Optional<Scheduler> findByName(String name);
	
	List<Scheduler> findAll();
	
	List<Scheduler> findAll(long first, long count);
	
	long count();
	
	void delete(Scheduler scheduler);
}