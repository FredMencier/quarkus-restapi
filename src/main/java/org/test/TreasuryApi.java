package org.test;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@Path("/admin/treasury/pushforward")
public interface TreasuryApi {

    @POST
    void pushForward(@QueryParam("sontractRef") String contractRef);
}
