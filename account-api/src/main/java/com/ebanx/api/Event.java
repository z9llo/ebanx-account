package com.ebanx.api;

import com.ebanx.dominio.EventInput;
import com.ebanx.dominio.EventOutput;
import com.ebanx.negocio.AccountService;
import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

@Path("/event")
public class Event {

    @Inject
    private AccountService accountService;

    @POST
    @Produces("application/json")
    public Response event(EventInput event) {
        EventOutput eventOutput = this.accountService.event(event);

        if (eventOutput == null) {
            return Response.status(Response.Status.NOT_FOUND).entity(0).build();
        }

        return Response.status(Response.Status.CREATED).entity(eventOutput).build();
    }

}
