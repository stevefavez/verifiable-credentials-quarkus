package org.openssi.vc.emittter.ressource;

import org.eclipse.microprofile.health.HealthCheckResponse;
import org.openssi.vc.emittter.model.VerifiableCredentialRequest;
import org.openssi.vc.model.VerifiableCredential;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


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
        return Response.ok(HealthCheckResponse.up("Credentials API is up")).build() ;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response proofCredentialsTest(final VerifiableCredentialRequest verifiableCredentialRequest) {
        LOGGER.debug("Creating a proofed credential");

        VerifiableCredential verifiableCredential = new VerifiableCredential() ;
        verifiableCredential.verifiableCredentialBody = verifiableCredentialRequest.verifiableCredentialBody ;
        verifiableCredential.proof = "fljfjklwe" ;

        return Response.ok(verifiableCredential).build();
    }

}
