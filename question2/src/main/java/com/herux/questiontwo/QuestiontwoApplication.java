package com.herux.questiontwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) 
@ComponentScan({"com.herux.controllers", "com.herux.services", "com.herux.repositories"})
@EntityScan("com.herux.models")
@EnableMongoRepositories("com.herux.repositories")
public class QuestiontwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestiontwoApplication.class, args);
	}

}
