package com.ebanx.api;

import com.ebanx.negocio.AccountService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;

@Path("/balance")
public class Balance {

    @Inject
    private AccountService accountService;

    @GET
    @Produces("application/json")
    public Response getBalance(@QueryParam("account_id") Long accountId) {
        Long balance = this.accountService.getBalance(accountId);

        if (balance == null) {
            return Response.status(Response.Status.NOT_FOUND).entity(0).build();
        }

        return Response.ok(balance).build();
    }
}