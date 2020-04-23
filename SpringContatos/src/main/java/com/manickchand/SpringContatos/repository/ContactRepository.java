package com.manickchand.SpringContatos.repository;

import com.manickchand.SpringContatos.entity.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long> {
    Contact findById(long id);
}