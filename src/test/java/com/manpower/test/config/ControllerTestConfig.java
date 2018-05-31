package com.manpower.test.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan("com")
@EnableAutoConfiguration
public class ControllerTestConfig {
	
	
	

		public static void main(String[] args) {
			SpringApplication.run(ControllerTestConfig.class, args);
		}
		

}
