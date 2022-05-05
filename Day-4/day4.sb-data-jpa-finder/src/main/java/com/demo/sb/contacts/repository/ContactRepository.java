package com.demo.sb.contacts.repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.sb.contacts.entity.Contact;

@Repository // optional
public interface ContactRepository extends CrudRepository<Contact, Serializable> {

	Optional<Contact> findByContactName(String string);

	Optional<Contact> findByContactNumber(String string);

	Optional<Contact> findByContactNameAndContactNumber(String string, String string2);
	
	Optional<Contact> findByContactNameLike(String string);

	/*
	 * // @Query("select contactName from co.demo.sb.contacts.entity.Contact")
	 * //--HQL Hibernate Query Language
	 */	
	
	@Query(value = "select CONTACT_NAME from CONTACT_MASTER", nativeQuery = true)
	List<String> findAllContactNames();

	@Query("from com.demo.sb.contacts.entity.Contact where contactName=:name")
	Contact getContactByName(String name);

	

	
}
