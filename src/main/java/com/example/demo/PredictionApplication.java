package com.example.demo;

import org.activiti.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PredictionApplication {
	@Autowired
	private RuntimeService runtimeService;
	@Autowired
	public PredicationServicies predicationServicies;
	public static void main(String[] args) {
		SpringApplication.run(PredictionApplication.class, args);
	}
	@RequestMapping(value = "/mittal/startprocess")
	public void starProcess() {
		System.out.println("heeeeeemlooooooo");
		runtimeService.startProcessInstanceByKey("Process_1");
		
		
		
	}
}
