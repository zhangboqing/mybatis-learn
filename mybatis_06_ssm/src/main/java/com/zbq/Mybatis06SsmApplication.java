package com.zbq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"applicationContext.xml"})
public class Mybatis06SsmApplication {

	public static void main(String[] args) {

		SpringApplication.run(Mybatis06SsmApplication.class, args);
	}
}
