package com.anirudh.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {
	public static void main(String[] args) {

		 SpringApplication.run(SpringBootDemoApplication.class, args);
		 Alien obj = new Alien();
		 obj.code();
	}
}
