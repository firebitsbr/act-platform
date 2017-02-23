package no.mnemonic.act.platform.service;

import no.mnemonic.act.platform.service.contexts.RequestContext;
import no.mnemonic.act.platform.service.contexts.SecurityContext;

/**
 * Every Service implementation needs to implement this interface in order to use cross-cutting functionality provided by aspects.
 */
public interface Service {

  /**
   * Create a service-specific SecurityContext.
   *
   * @return New SecurityContext
   */
  SecurityContext createSecurityContext();

  /**
   * Create a service-specific RequestContext.
   *
   * @return New RequestContext
   */
  RequestContext createRequestContext();

}