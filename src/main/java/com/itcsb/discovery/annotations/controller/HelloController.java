package com.itcsb.discovery.annotations.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itcsb.discovery.LoggingAspect.annotations.BusinessLog;
import com.itcsb.discovery.LoggingAspect.enums.BusinessAction;

@RestController
public class HelloController {

	@RequestMapping("/")
	@BusinessLog(LogAction = BusinessAction.CCS)
	public String index() {
		return "Greetings from Spring Boot!";
	}

}