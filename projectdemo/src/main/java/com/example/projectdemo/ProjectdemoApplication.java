package com.example.projectdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example.projectdemo")
@EntityScan(basePackages = "com.example.projectdemo.dto")
@EnableJpaRepositories(basePackages = "com.example.projectdemo.repository")

public class ProjectdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectdemoApplication.class, args);
	}

}
