package com.thinkbox.sc2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Sc2ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sc2ConfigServerApplication.class, args);
	}

}
