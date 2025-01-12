package com.alphabet.amscore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.alphabet.amsdocument.repository")
public class AmsCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmsCoreApplication.class, args);
	}

}
