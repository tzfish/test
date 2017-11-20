package com.train;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:applicationcontext.xml")
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = "com.train") 
public class Application {



	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
