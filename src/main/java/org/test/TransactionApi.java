package org.test;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@Path("/admin/transaction/createpseudotransactions")
public interface TransactionApi {

    @POST
    void createPseudoTransactions(@QueryParam("accountingDate") String accountingDate, @QueryParam("apps") String apps);

}
