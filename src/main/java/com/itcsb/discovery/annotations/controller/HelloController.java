package com.itcsb.discovery.annotations.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itcsb.discovery.annotations.annotates.BusinessLog;

@RestController
public class HelloController {

	@RequestMapping("/")
	@BusinessLog
	public String index() {
		return "Greetings from Spring Boot!";
	}

}