package com.anderscore.technology.testcontainers.frontend.mapping;

import com.anderscore.technology.testcontainers.data.Scheduler;

public interface SchedulerMapper {
	
	SchedulerUi asUi(Scheduler scheduler);
	
	Scheduler asEntity(SchedulerUi schedulerUi);
}