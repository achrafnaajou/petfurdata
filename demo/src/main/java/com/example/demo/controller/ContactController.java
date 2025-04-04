package com.example.demo.controller;

import com.example.demo.entities.Contact;
import com.example.demo.service.ServiceContact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/api")


public class ContactController {
    @Autowired
    ServiceContact serviceContact;
    @GetMapping("/contacts")
       public List<Contact> findAll() {

        return serviceContact.findAll();

       }


       @PostMapping("/contacts")
    public Contact createContact(@RequestBody Contact contact) {
        return serviceContact.createContact(contact);


       }
       @GetMapping("/contacts/view")
    public String viewContacts(Model model){
        List<Contact> contacts = serviceContact.findAll();
        model.addAttribute("contacts", contacts);
        return "contacts";
       }

}
