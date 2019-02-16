package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Autowired
	private Customer customer;
	
	@RequestMapping("/nameRS")
	public String helloRS() {
		return customer.getDataRequestScope().getName();
	}
	
	@RequestMapping("/nameSSUpdate")
	public String helloSSUpdate() {
		customer.getDataSessionScope().setName("Session scope updated");
		return customer.getDataSessionScope().getName();
	}
	
	@RequestMapping("/nameSS")
	public String helloSS() {
		return customer.getDataSessionScope().getName();
	}
}
