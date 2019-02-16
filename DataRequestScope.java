package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value="request",proxyMode=ScopedProxyMode.TARGET_CLASS)
public class DataRequestScope {
	
	private String name = "Request scope";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public DataRequestScope() {
		System.out.println("DataRequestScope instance is called");
	}
	
	

}
