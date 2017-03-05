package com.NYTimes.rest;


import com.NYTimes.NYTimesDao.ResponseDaoImpl;
import com.NYTimes.data.Response;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    ResponseDaoImpl responseDaoImpl;

    @RequestMapping(value="/home/{section}",method= RequestMethod.GET, produces = "application/json")
    public String getStoriesOfSection(@PathVariable String section) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(topStories)
                .queryParam("api-key",key);
        RestTemplate restTemplate = new RestTemplate();
        Response response = restTemplate.getForObject(builder.buildAndExpand(section).encode().toUri(), Response.class);
        responseDaoImpl.persistResponse(response);
        return response.toString();
    }
}
