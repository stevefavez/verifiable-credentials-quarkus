package org.openssi.vc.verifier.ressource;

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
 * the goal of this ressource is to provide an endpoint allowing to verifiy (validate)
 * credentials. (verifiable credentials of presentable verifiable credentials)
 */
@Path("/api/v1/verifier/credentialverifications")
public class CredentialVerifications {
    private final static Logger LOGGER = LoggerFactory.getLogger(CredentialVerifications.class) ;

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
    public Response verifyCredential(@HeaderParam("x-credentialType") @DefaultValue("json-ld") String credentialType,
            JsonObject jsonCredentials) {
        LOGGER.debug("Creating a proofed credential");

        return Response.ok().build();
    }
}
