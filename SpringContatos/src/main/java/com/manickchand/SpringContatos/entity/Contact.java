package com.manickchand.SpringContatos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(schema = "public", name = "CONTATOS")
public class Contact {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(length = 100)
    private String name;

    @Column(length = 50)
    private String sex;

    @Column(length = 50)
    private String phone;

    @Column(length = 150)
    private String email;

    public Contact() {}
}
