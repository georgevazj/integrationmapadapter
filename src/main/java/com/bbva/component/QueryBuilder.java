package com.bbva.component;

import org.springframework.stereotype.Component;

/**
 * Created by jorge on 10/07/17.
 */

@Component
public class QueryBuilder {

    public String getLength(String queue) {
        String query = "MATCH p=(cola:JMSObject {name: %s})<-[:WRITES_IN|READS_FROM*]-(service:Service)-->(application:Application) return distinct application.name as application, service.name as service, length(p)/2 as distance order by distance";
        return String.format(query, queue);
    }

}
