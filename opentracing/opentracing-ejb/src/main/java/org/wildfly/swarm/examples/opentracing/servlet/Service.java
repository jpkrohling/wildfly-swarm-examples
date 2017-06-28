package org.wildfly.swarm.examples.opentracing.servlet;

import io.opentracing.contrib.ejb.OpenTracingInterceptor;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import java.util.logging.Logger;

/**
 * @author Juraci Paixão Kröhling
 */
@Stateless
@Interceptors(OpenTracingInterceptor.class)
public class Service {
    private static final Logger log = Logger.getLogger(Service.class.getName());

    public void doSomething() {
        log.info("Doing something");
    }
}
