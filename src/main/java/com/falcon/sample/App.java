package com.falcon.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class App extends SpringBootServletInitializer
{
    
    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
