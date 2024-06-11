package com.shami.SpringDataJpa;

import com.shami.SpringDataJpa.Models.Author;
import com.shami.SpringDataJpa.Repository.AuthorRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}
@Bean
	public CommandLineRunner commandLineRunner(AuthorRepo authorRepo){
	return args -> {
		System.out.println("Hello it's @Qubyte !!! ");
	};
}
}
