package co.demo.boot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.demo.boot.entity.Contact;

@Repository // optional
public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
