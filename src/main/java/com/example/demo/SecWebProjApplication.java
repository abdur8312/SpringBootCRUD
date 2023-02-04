package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.example.demo.model")
@EnableJpaRepositories("com.example.demo.dao")
public class SecWebProjApplication {
	public static void main(String[] args) {
		SpringApplication.run(SecWebProjApplication.class, args);
	}

}
