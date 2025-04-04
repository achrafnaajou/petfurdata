package com.example.demo.repository;

import com.example.demo.entities.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ContactRepo extends CrudRepository<Contact, Long> {






}
