package org.openssi.vc.emittter.ressource;

import javax.json.Json;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 * The goal of this endpoint is to provide functionalities to emit new credentials
 * and also manage 
 */
@Path("/api/v1/emitter/credentials")
public class Credentials {
    
    @Path("ping")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response ping() {
        return Response.ok( Json.createObjectBuilder().add(arg0, arg1) )
    }

}
