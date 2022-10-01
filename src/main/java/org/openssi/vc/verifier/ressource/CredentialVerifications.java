package org.openssi.vc.verifier.ressource;

import org.eclipse.microprofile.health.HealthCheckResponse;
import org.openssi.vc.model.VerifiableCredential;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


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
        LOGGER.debug("Pinging verifier Credentials endpoint");
        return Response.ok(HealthCheckResponse.up("Credentialverifications API is up")).build() ;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response verifyCredential(final VerifiableCredential verifiableCredential) {
        LOGGER.debug("Creating a proofed credential");

        return Response.ok().build();
    }
}
