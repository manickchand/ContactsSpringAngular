package com.manickchand.SpringContatos.resources;

import com.manickchand.SpringContatos.dto.ContactDTO;
import com.manickchand.SpringContatos.entity.Contact;
import com.manickchand.SpringContatos.services.ContactServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.ws.rs.*;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.List;

@Path("/contact")
@CrossOrigin(origins = "*")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class ContactResources {

    @Autowired
    private ContactServices service;

    @GET
    @Consumes("application/json")
    public void getAllContacts(@Suspended AsyncResponse asyncResponse) throws IOException {

        List<Contact> result = service.getAllContact();
        asyncResponse.resume(result);
    }

    @POST
    @Consumes("application/json")
    public void saveContact(@Suspended AsyncResponse asyncResponse,
                            ContactDTO dto) throws IOException {

        Contact result = service.saveContact(dto);
        asyncResponse.resume(result);
    }

    @PUT
    @Consumes("application/json")
    public void updateContact(@Suspended AsyncResponse asyncResponse,
                            ContactDTO dto) throws IOException {

        Contact result = service.updateContact(dto);
        asyncResponse.resume(result);
    }

    @DELETE
    @Consumes("application/json")
    public void deleteContact(@Suspended AsyncResponse asyncResponse,
                              ContactDTO dto) throws IOException {

        asyncResponse.resume(service.deleteContact(dto));
    }

}
