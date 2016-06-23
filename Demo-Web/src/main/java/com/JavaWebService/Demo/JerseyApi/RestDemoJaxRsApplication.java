package com.JavaWebService.Demo.JerseyApi;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

public class RestDemoJaxRsApplication extends ResourceConfig {

	public RestDemoJaxRsApplication(){
		packages("com.JavaWebService.Demo.facade");
		register(LoggingFilter.class);

        // register filters
        register(RequestContextFilter.class);
        register(LoggingResponseFilter.class);
        register(CORSResponseFilter.class);

        // register features
        register(JacksonFeature.class);
        register(MultiPartFeature.class);
	}
}
