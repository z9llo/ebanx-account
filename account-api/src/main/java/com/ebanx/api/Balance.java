package com.ebanx.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;

@Path("/balance")
public class Balance {

    @GET
    @Produces("application/json")
    public Long getBalance(@QueryParam("account_id") Long accountId) {
        return 0L;
    }
}