package com.example.demo.service;

import com.example.demo.entities.Contact;
import com.example.demo.repository.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceContactImple implements ServiceContact {
 @Autowired
 private ContactRepo contactRepo;

    @Override
    public List<Contact> findAll() {
        return (List<Contact>) contactRepo.findAll();
    }

    @Override
    public Contact createContact(Contact contact) {
        return contactRepo.save(contact);
    }
}
