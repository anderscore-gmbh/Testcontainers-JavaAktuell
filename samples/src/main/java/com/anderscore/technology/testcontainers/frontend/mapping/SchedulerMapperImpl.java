package com.anderscore.technology.testcontainers.frontend.mapping;

import javax.inject.Inject;

import com.anderscore.technology.testcontainers.service.SchedulerService;
import com.anderscore.technology.testcontainers.data.Scheduler;
import org.springframework.stereotype.Component;

@Component
public class SchedulerMapperImpl implements SchedulerMapper{
	
	@Inject
	private SchedulerService schedulerService;

	@Override
	public SchedulerUi asUi(Scheduler scheduler) {
		SchedulerUi schedulerUi = new SchedulerUi();
		schedulerUi.setId(scheduler.getId());
		schedulerUi.setName(scheduler.getName());
		
		return schedulerUi;
	}

	@Override
	public Scheduler asEntity(SchedulerUi schedulerUi) {
		Scheduler scheduler = schedulerUi.hasId() ? schedulerService.find(schedulerUi.getId()).get() : new Scheduler();
		scheduler.setName(schedulerUi.getName());
		
		return scheduler;
	}
}