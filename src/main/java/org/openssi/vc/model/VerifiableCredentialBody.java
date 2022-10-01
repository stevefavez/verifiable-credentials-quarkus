package org.openssi.vc.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This model contains every required attributes that defines a verifiable credentials
 * It's the "what" of the credential - the purpose of it.
 */
public class VerifiableCredentialBody {

    @JsonProperty("@context")
    public List<URI> contexts = new ArrayList<>() ;
    public String id ;
    public List<String> type = new ArrayList<>() ;
    public URI issuer ;
    public String issuanceDate ;
    public Map<String, Object> credentialSubject = new HashMap<>() ;

    public VerifiableCredentialBody() {}
}
