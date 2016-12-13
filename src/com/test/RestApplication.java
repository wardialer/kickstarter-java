package com.test;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


@ApplicationPath("/test")
public class RestApplication extends Application{
		
	@PostConstruct
	public void init() {
		System.out.println("RestApplication inited");
	}
	
}
