package com.bbva.service.impl;

import com.bbva.constant.QueryConstant;
import com.bbva.model.Query;
import com.bbva.model.QueryResult;
import com.bbva.service.MapService;
import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.Record;
import org.neo4j.driver.v1.Session;
import org.neo4j.driver.v1.StatementResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jorge on 10/07/17.
 */

@Service
public class MapServiceImpl implements MapService {

    private static final Logger LOG = LoggerFactory.getLogger(MapService.class);

    @Autowired
    private Driver driver;

    @Override
    public Query getQueueLength(String queue) {
        Session session = driver.session();
        StatementResult result = session.run(String.format(QueryConstant.LENGTH_QUERY,queue));
        Query query = new Query();
        while (result.hasNext()){
            Record record = result.next();
            QueryResult queryResult = new QueryResult(record.get("application").asString(), record.get("service").asString(), record.get("distance").asInt());
            query.getQueryResults().add(queryResult);
        }
        session.close();
        return query;
    }

}
