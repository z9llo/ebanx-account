package com.ebanx;

import com.ebanx.negocio.AccountService;
import jakarta.ws.rs.ApplicationPath;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.process.internal.RequestScoped;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/api")
public class RestApplicationConfig extends ResourceConfig {

    public RestApplicationConfig() {
        packages("com.ebanx.api");

        register(new AbstractBinder() {
            @Override
            protected void configure() {
                bindAsContract(AccountService.class).in(RequestScoped.class);
            }
        });
    }

}