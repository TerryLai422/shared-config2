package com.thinkbox.sc2;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppService {

	@Value("${spring.application.name}")
	private String appName;
	
	@Value("${common:-}")
	private String common;

	@Value("${overrided:-}")
	private String overrided;
	
	@PostConstruct
	public void init() {
		System.out.println("app name: " + appName);
		System.out.println("common:" + common);
		System.out.println("overrided: " + overrided);
	}
}
