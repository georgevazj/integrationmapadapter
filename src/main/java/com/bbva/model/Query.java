package com.bbva.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jorge on 10/07/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Query {

    private List<QueryResult> queryResults = new ArrayList<>();


    public Query() {
    }

    public Query(List<QueryResult> queryResults) {
        this.queryResults = queryResults;
    }

    public List<QueryResult> getQueryResults() {
        return queryResults;
    }

    public void setQueryResults(List<QueryResult> queryResults) {
        this.queryResults = queryResults;
    }

    @Override
    public String toString() {
        return "Query{" +
                "queryResults=" + queryResults +
                '}';
    }
}
