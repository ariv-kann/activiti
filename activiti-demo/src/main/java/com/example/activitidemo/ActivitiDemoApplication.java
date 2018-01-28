package com.example.activitidemo;

import org.activiti.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ActivitiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActivitiDemoApplication.class, args);
	}
	
	@RestController
	public static class MyRestController{
		
		@Autowired
		private RuntimeService runtimeService;
		
		@GetMapping(value="start-my-process")
		public void startMyProcess() {
			runtimeService.startProcessInstanceByKey("");
		}
	}
}
