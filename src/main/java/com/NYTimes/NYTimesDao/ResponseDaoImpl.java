package com.NYTimes.NYTimesDao;

import com.NYTimes.data.Response;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by iceman on 2/22/2017.
 */
public class ResponseDaoImpl {

    @Autowired
    private ResponseDao responseDao;

    public void persistResponse(Response response){
        responseDao.save(response);
    }

}
