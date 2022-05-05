package co.demo.boot;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import co.demo.boot.entity.Contact;
import co.demo.boot.repository.ContactRepository;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		ContactRepository contactRepo = context.getBean(ContactRepository.class); 
		// proxy design pattern -> as a result an implementation class will be created at run time
		System.out.println(contactRepo.getClass().getName());

		/*
		 * //--- add a new contact in DB 
		 * 
		 * Contact contact = new Contact();
		 * contact.setContactId(1); 
		 * contact.setContactName("Subham");
		 * contact.setContactNumber("9848586878");
		 * 
		 * Contact savedContact = contactRepo.save(contact);
		 * System.out.println(savedContact);
		 */

		/*--------------------------------------------------------------------*/

		/*
		 * //---- to save multiple contacts ---- 
		 * 
		 * List<Contact> contacts = Arrays.asList(new Contact(2, "Arun Shinde", "8745874585"),
		 * 										  new Contact(3, "James Kabe","8585857474"),
		 * 										  new Contact(4, "Pokuri Sumani", "9696858574"), 
		 *    									  new Contact(5,"Pranabk Kumar", "7485969685")); 
		 * contactRepo.saveAll(contacts);
		 */

		/*--------------------------------------------------------------------*/
		
		/*
		 * System.out.println("No of Contacts in Database ---> " + contactRepo.count());
		 * System.out.println("Is a Contact with contactId (1) exists --> " + contactRepo.existsById(1));
		 */

		/*--------------------------------------------------------------------
		 
	
		//-- search a contact based on contactId
		 
		Integer cid = 1;
		
		//in order to take care of null value gracefully we use optional
		Optional<Contact> optContact = contactRepo.findById(cid);
		
		if(optContact.isPresent()) {
			Contact contact = optContact.get();
			System.out.println(contact);
		}else {
			System.out.println("No Matching Contact for Contact ID ---> " + cid );
		}
		*/

		/*--------------------------------------------------------------------
		 
		//-- getting all the contacts
		Iterable<Contact> contacts = contactRepo.findAll();
		for(Contact contact : contacts) {
			System.out.println(contact);
			try { 
				Thread.sleep(1000);
			}
			catch(Exception ex) {}
		}
		*/

		/*--------------------------------------------------------------------
		 
		//--- to get Contact details based on multiple contactIds
		 	
		Iterable<Integer> ids = Arrays.asList(1,3,34,5);
		Iterable<Contact> contacts = contactRepo.findAllById(ids);
		for(Contact contact : contacts) {
			System.out.println(contact);
		}				
		*/

		// -- to update a contact
		Contact contact = new Contact();
		
		// contact.setContactId(1);
		contact.setContactId(6);
		contact.setContactName("Sunil Shetty");
		contact.setContactNumber("1234567890");

		Contact savedContact = contactRepo.save(contact);
		System.out.println(savedContact);

		// -- work on delete methods of CrudRepository

		// -- closing spring container
		context.close();
	}

}
