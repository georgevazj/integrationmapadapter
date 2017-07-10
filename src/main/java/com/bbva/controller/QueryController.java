package com.bbva.controller;

import com.bbva.model.Query;
import com.bbva.service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;

/**
 * Created by jorge on 10/07/17.
 */

@RestController
public class QueryController {

    @Autowired
    private MapService mapService;

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public Query getLength(@RequestParam(value = "queue") String queue) throws UnknownHostException {
        return mapService.getQueueLength(queue);
    }

}
