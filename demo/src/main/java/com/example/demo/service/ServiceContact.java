package com.example.demo.service;

import com.example.demo.entities.Contact;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceContact {
   List<Contact> findAll();
   Contact createContact(Contact contact);


}
