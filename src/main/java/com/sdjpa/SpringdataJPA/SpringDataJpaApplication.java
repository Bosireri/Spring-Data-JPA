package com.sdjpa.SpringdataJPA;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	//Connected to StudRepository
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository){
		return args -> {
			Student nyabuto = new Student(
					"Nyabuto",
					"Richard",
					"nyabutorichard017@gmail.com",
					21
			);
			studentRepository.save(nyabuto);
		};
	}
}
