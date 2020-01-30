package com.anderscore.technology.testcontainers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SchedulerApplication {

	public static void main(String[] args){
		new SpringApplicationBuilder()
				.sources(SchedulerApplication.class)
				.run(args);
	}
}