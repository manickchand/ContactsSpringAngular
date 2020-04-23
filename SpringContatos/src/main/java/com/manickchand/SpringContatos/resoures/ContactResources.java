package com.manickchand.SpringContatos.resoures;

import com.manickchand.SpringContatos.dto.ContactDTO;
import com.manickchand.SpringContatos.entity.Contact;
import com.manickchand.SpringContatos.services.ContactServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactResources {

    @Autowired
    private ContactServices service;

    @GetMapping()
    public List<Contact> getAllContacts() {
        return service.getAllContact();
    }

    @PostMapping()
    public Contact saveContact(@RequestBody ContactDTO dto) {
        return service.saveContact(dto);
    }

    @PutMapping()
    public Contact updateContact(@RequestBody ContactDTO dto){
        return service.updateContact(dto);
    }

    @DeleteMapping()
    public Contact deleteContact(@RequestBody ContactDTO dto){
        return service.deleteContact(dto);
    }

}