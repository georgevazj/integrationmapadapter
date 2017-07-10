package com.bbva.constant;

/**
 * Created by jorge on 10/07/17.
 */

public class QueryConstant {

    public static final String LENGTH_QUERY = "MATCH p=(cola:JMSObject {name: %s})<-[:WRITES_IN|READS_FROM*]-(service:Service)-->(application:Application) return distinct application.name as application, service.name as service, length(p)/2 as distance order by distance";

}
