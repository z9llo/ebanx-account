package com.ebanx.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class Util {

    @Path("reset")
    @GET
    public String reset() {
        return "";
    }
}