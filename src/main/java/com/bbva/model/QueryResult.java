package com.bbva.model;

/**
 * Created by jorge on 10/07/17.
 */

public class QueryResult {

    private String application;
    private String service;
    private int distance;

    public QueryResult() {
    }

    public QueryResult(String application, String service, int distance) {
        this.application = application;
        this.service = service;
        this.distance = distance;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "QueryResult{" +
                "application='" + application + '\'' +
                ", service='" + service + '\'' +
                ", distance=" + distance +
                '}';
    }
}
