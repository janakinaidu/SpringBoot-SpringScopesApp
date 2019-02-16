package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value="session",proxyMode=ScopedProxyMode.TARGET_CLASS)
public class DataSessionScope {
	
	private String name = "Session scope";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public DataSessionScope() {
		System.out.println("DataSessionScope constructor is called at" + LocalDateTime.now());
	}
	
}
