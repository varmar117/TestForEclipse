package com.example.RegistrationPage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class RegistrationPageApplication {

	private static final Logger log = LoggerFactory.getLogger(RegistrationPageApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RegistrationPageApplication.class, args);
		log.info("Application started");
		log.info("Ready to go");
	}

}
