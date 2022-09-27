package org.openssi.vc.emittter.ressource;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * The goal of this endpoint is to provide functionalities to emit new
 * credentials
 * and also manage if the credentials is supposed to be in json-ld or in jwt.
 */
@Path("/api/v1/emitter/credentials")
public class Credentials {

    private final static Logger LOGGER = LoggerFactory.getLogger(Credentials.class) ;

    @Path("ping")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response ping() {
        LOGGER.debug("Pinging emitter Credentials endpoint");
        return Response.ok(Json.createObjectBuilder().add("status", "UP").build()).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response proofCredentials(@HeaderParam("x-credentialType") @DefaultValue("json-ld") String credentialType,
            JsonObject jsonCredentials) {
        LOGGER.debug("Creating a proofed credential");
        JsonObject proofedCredential = Json.createObjectBuilder(jsonCredentials).add("proof", "MYpROOF").build();

        return Response.ok(proofedCredential).build();
    }

}
