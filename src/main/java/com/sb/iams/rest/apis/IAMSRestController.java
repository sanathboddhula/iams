package com.sb.iams.rest.apis;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sb.iams.data.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("")
public class IAMSRestController {
    @GetMapping("/greet")
    public String constructGreeting(String name) {

        return "Hello " + name;
    }

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) throws JsonProcessingException {
        return " from registerUser method" + user.toString();
    }
}
