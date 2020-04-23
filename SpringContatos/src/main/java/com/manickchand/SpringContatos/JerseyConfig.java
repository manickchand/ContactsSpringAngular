package com.manickchand.SpringContatos;

import com.manickchand.SpringContatos.resources.ContactResources;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@Primary
@ApplicationPath(JerseyConfig.API_PATH)
public class JerseyConfig extends ResourceConfig {

    public static final String API_PATH = "/api";

    public JerseyConfig() {
        this.register(ContactResources.class);
        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
    }

}
