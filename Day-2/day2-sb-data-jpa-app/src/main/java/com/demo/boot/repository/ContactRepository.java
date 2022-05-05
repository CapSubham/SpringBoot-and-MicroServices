package com.demo.boot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.boot.entity.Contact;

@Repository //optional
public interface ContactRepository extends CrudRepository<Contact, Integer>{
	
	
}
