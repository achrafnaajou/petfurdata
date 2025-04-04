package com.example.demo;

import com.example.demo.entities.Contact;
import com.example.demo.repository.ContactRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcomApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomApplication.class, args);
	}
@Bean
	public CommandLineRunner commandLineRunner(ContactRepo contactRepo) {
		return args -> {
			Contact contact = new Contact(null,"achraf","najou","najou965","072258665","salam al3alam");
			Contact contact1 = new Contact(null,"achraf","najou","najou965","072258665","salam al3alam");
			Contact contact2 = new Contact(null,"achraf","najou","najou965","072258665","salam al3alam");
			contactRepo.save(contact);
			contactRepo.save(contact1);
			contactRepo.save(contact2);
			System.out.println(contact);

		};
}
}
