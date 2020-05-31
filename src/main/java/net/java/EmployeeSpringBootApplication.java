package net.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("net.java.entity")
@EnableJpaRepositories("net.java.repository")
@SpringBootApplication
@ComponentScan(basePackages = { "net.java.controller.sub" })
public class EmployeeSpringBootApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmployeeSpringBootApplication.class, args);
	}
}
