package com.sb.iams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IAMSApplication {
    public static void main(String[] args) {
        System.out.println(constructGreeting("Sanath"));
        SpringApplication.run(IAMSApplication.class, args);

    }

    protected static String constructGreeting(String name) {
        return "Hello " + name;
    }
}
