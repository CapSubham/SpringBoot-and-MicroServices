package com.jboss.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello, I am running on Jboss EAP";
	}

}
