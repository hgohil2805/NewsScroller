package com.NYTimes.rest;

import com.NYTimes.data.Response;
import com.sun.javafx.fxml.builder.URLBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

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

    @RequestMapping(value="/home/{section}",method= RequestMethod.GET, produces = "application/json")
    public String index(@PathVariable String section) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(topStories)
                .queryParam("api-key",key);
        RestTemplate restTemplate = new RestTemplate();
        Response response = restTemplate.getForObject(builder.buildAndExpand(section).encode().toUri(), Response.class);
        return response.toString();

    }
}
