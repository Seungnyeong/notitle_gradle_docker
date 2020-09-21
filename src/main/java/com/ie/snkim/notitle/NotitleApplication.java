package com.ie.snkim.notitle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@Configuration
@PropertySource(value = "classpath:application-core.properties")
public class NotitleApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotitleApplication.class, args);
    }

}
