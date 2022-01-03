package com.sb.iams.rest.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("")
public class IAMSRestController {
    @GetMapping("/greet")
    public String constructGreeting(String name) {
        return "Hello " + name;
    }
}
