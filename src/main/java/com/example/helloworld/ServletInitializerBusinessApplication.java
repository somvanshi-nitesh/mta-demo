package com.example.helloworld;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializerBusinessApplication extends SpringBootServletInitializer {
	@Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder application) {
        return application.sources(HelloWorldApplication.class);
    }
}
