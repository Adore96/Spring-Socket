package com.adore96.SpringbootSocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootSocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSocketApplication.class, args);
	}

}
