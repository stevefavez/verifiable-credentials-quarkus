package org.openssi.vc.model;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

/**
 * This is a verifiable credentials containing the body (the What's about this credentials)
 * and the proof - the signature of the issuer.
 */
public class VerifiableCredential  {
    /**
     * the "what" of the verifiable credentials
     */
    @JsonUnwrapped
    public VerifiableCredentialBody verifiableCredentialBody ;
    /**
     * the proof and metadata to manage this vc.
     */
    public String proof ;

    public VerifiableCredential() {
        super() ;
    }
}
