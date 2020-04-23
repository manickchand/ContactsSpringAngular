package com.manickchand.SpringContatos.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ContactDTO {

    private Long id;
    private String name;
    private String sex;
    private String phone;
    private String email;

    public ContactDTO(Long id, String name, String sex, String phone, String email) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.email = email;
    }
}
