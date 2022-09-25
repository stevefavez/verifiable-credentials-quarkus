package org.openssi.vc;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;
import org.eclipse.microprofile.health.Readiness;

/**
 * ensure application's ready and live
 */
@Liveness
@Readiness
@ApplicationScoped
public class VCHealthAndLiveness implements HealthCheck {

    private final String HEALTH_AND_LIVE_OK_MSG = "Open SSI for verifiable credientials is up and running - enjoy" ;

    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.up(HEALTH_AND_LIVE_OK_MSG);
    }
    
}
