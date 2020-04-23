package com.manickchand.SpringContatos.services;

import com.manickchand.SpringContatos.dto.ContactDTO;
import com.manickchand.SpringContatos.entity.Contact;
import com.manickchand.SpringContatos.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServices {

    @Autowired
    private ContactRepository contactRepository;

    public Contact saveContact(ContactDTO dto) {
        return this.contactRepository.save(castDtoToContact(dto));
    }

    public Contact updateContact(ContactDTO dto) {
        return this.contactRepository.save(castDtoToContact(dto));
    }

    public List<Contact> getAllContact() {
        return (List<Contact>) this.contactRepository.findAll();
    }

    public Contact deleteContact(ContactDTO dto) {

        Contact contact = castDtoToContact(dto);
        try {
            this.contactRepository.delete(contact);
        }catch (Exception e){
            contact = null;
        }
        return contact;

    }

    private Contact castDtoToContact(ContactDTO dto){
        Contact contact = new Contact();
        contact.setId(dto.getId());
        contact.setName(dto.getName());
        contact.setEmail(dto.getEmail());
        contact.setPhone(dto.getPhone());
        contact.setSex(dto.getSex());
        return contact;
    }

}
