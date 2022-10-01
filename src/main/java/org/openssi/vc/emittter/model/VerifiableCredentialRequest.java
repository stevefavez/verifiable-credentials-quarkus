package org.openssi.vc.emittter.model;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import org.openssi.vc.model.VerifiableCredentialBody;

/**
 * The goal of this model is to contains all required data to generate a verifiable credentials
 * It contains the data of the verifiable credentials - the body
 * and the data explaining how it must be prooved. (to generate the proof)
 */
public class VerifiableCredentialRequest {
    /**
     * Body - the verifiable credentials data - the "what"
     */
    @JsonUnwrapped
    public VerifiableCredentialBody verifiableCredentialBody ;

    public VerifiableCredentialRequest() {}
}
