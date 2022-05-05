package com.demo.boot;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.demo.boot.entity.Contact;
import com.demo.boot.repository.ContactRepository;

import java.util.List;
import java.util.Optional;

import ch.qos.logback.core.Context;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		ContactRepository contactRepository = applicationContext.getBean(ContactRepository.class);
		// proxy design pattern
		System.out.println(contactRepository.getClass().getName());

		/*-------------------------------------------------------------------------------*/

		/*
		 * Add a new contact in DB Contact contact = new Contact();
		 * contact.setContactId(1); contact.setContactName("Subham");
		 * contact.setConatactNumber("8777540922");
		 * 
		 * Contact savedContact = contactRepository.save(contact);
		 * System.out.println("Saved Contact -> " + savedContact);
		 */

		/*-------------------------------------------------------------------------------*/

		/*
		 * // save multiple contacts List<Contact> contacts = Arrays.asList(new
		 * Contact(2, "Adarsh", "8777540966"), new Contact(3, "Aksh", "8777540977"), new
		 * Contact(4, "Prabhu", "8777540955"), new Contact(5, "Praveen", "8777540944"),
		 * new Contact(6, "John", "8777540923"));
		 * 
		 * contactRepository.saveAll(contacts);
		 */

		/*-------------------------------------------------------------------------------*/

		/*
		 * System.out.println("Number of contacts in DB --> " +
		 * contactRepository.count());
		 * System.out.println("Is a Contact with contactId (1) exists --> " +
		 * contactRepository.existsById(1));
		 * System.out.println("Is a Contact with contactId (10) exists --> " +
		 * contactRepository.existsById(10));
		 */

		/*-------------------------------------------------------------------------------*/

		/*
		 * Search a contact based on contactId Integer cid = 2; Optional<Contact>
		 * optContact = contactRepository.findById(cid); if (optContact.isPresent()) {
		 * Contact contact = optContact.get();
		 * System.out.println(" Contact Details --> " + contact); } else {
		 * System.out.println(" No matching cntact for Contact ID --> " + cid); }
		 */

		/*-------------------------------------------------------------------------------*/

		/*
		 * //getting all the contacts Iterable<Contact> contacts =
		 * contactRepository.findAll(); System.out.println("Contact Details :"); for
		 * (Contact contact : contacts) { System.out.println(contact); }
		 */

		/*-------------------------------------------------------------------------------*/

		/*
		 * // to get Contact details based on multiple coontactIds Iterable<Integer> ids
		 * = Arrays.asList(1, 2, 5, 6); Iterable<Contact> contacts =
		 * contactRepository.findAllById(ids); System.out.println("Contact Details :");
		 * for (Contact contact : contacts) { System.out.println(contact); }
		 */

		/*-------------------------------------------------------------------------------*/

		// to update a contact
		Contact contact = new Contact();
		contact.setContactId(1);
		contact.setContactName("Subham Dubey");
		contact.setConatactNumber("8777520685");
		Contact savedContact = contactRepository.save(contact);
		System.out.println("Updated Contact -> " + savedContact);

		/*-------------------------------------------------------------------------------*/

		/* closing spring container */
		applicationContext.close();

	}

}
