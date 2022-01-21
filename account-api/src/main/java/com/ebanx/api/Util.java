package com.ebanx.api;

import com.ebanx.negocio.AccountService;
import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/")
public class Util {

    @Inject
    private AccountService accountService;

    @Path("reset")
    @POST
    public Response reset() {
        String ok = "OK";
        return Response.ok(ok).build();
    }
}