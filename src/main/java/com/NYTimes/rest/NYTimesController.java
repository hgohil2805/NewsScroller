package com.NYTimes.rest;

import com.NYTimes.data.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by iceman on 11/29/2016.
 */
@Component
@RestController
public class NYTimesController {

    @Value("${nytimes.top.stories.base.url}")
    String topStories;

    @Value("${nytimes.key}")
    String key;

    @RequestMapping("/")
    public String index() {
        String URL = topStories+"?api-key="+key;
        System.out.println("Calling URL : "+URL);
        RestTemplate restTemplate = new RestTemplate();
        Response response = restTemplate.getForObject(topStories+"?api-key="+key, Response.class);
        return response.toString();
    }
}
