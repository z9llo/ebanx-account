package com.ebanx.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/event")
public class Event {

    @GET
    @Produces("text/plain")
    public String getEvent() {
        return "teste";
    }
}
