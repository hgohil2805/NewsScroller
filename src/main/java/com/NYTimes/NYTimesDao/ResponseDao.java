package com.NYTimes.NYTimesDao;

import com.NYTimes.data.Response;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by iceman on 2/22/2017.
 */
public interface ResponseDao extends MongoRepository<Response,String> {


}
