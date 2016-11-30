package com.NYTimes.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by iceman on 11/29/2016.
 */
@RestController
public class NYTimesController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
