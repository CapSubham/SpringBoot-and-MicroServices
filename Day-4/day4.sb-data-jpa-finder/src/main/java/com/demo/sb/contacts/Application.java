package com.demo.sb.contacts;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.sb.contacts.entity.Contact;
import com.demo.sb.contacts.repository.ContactRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		ContactRepository contactRepo = (ContactRepository) context.getBean("contactRepository");

		// Optional<Contact> optContact = contactRepo.findById(1);
		// Optional<Contact> optContact = contactRepo.findByContactName("Prabhu");
		// Optional<Contact> optContact = contactRepo.findByContactNumber("8745874585");
		// Optional<Contact> optContact = contactRepo.findByContactNameAndContactNumber("Subham Dubey", "8777520685");
		
		Optional<Contact> optContact = contactRepo.findByContactNameLike("A");
		if (optContact.isPresent()) {
			Contact contact = optContact.get();
			System.out.println(contact);
		} else {
			System.out.println("No matching contact found!!");
		}

		System.out.println("--------------------------------------------------------------");

		List<String> contactNames = contactRepo.findAllContactNames();
		for (String name : contactNames) {
			System.out.println(name);
		}

		System.out.println("--------------------------------------------------------------");

		Contact ct = contactRepo.getContactByName("Adarsh");
		System.out.println(ct);

		System.out.println("--------------------------------------------------------------");

	}

}
