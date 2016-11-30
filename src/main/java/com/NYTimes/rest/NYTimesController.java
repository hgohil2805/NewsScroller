package com.NYTimes.rest;

import com.NYTimes.data.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by iceman on 11/29/2016.
 */
@RestController
public class NYTimesController {

    @RequestMapping("/")
    public String index() {
        RestTemplate restTemplate = new RestTemplate();
        Response response = restTemplate.getForObject("https://api.nytimes.com/svc/topstories/v2/home.json?api-key=84221d7a9b934df88d7592dd513fb85b", Response.class);
        return response.toString();
    }
}
