package com.bbva.service;

import com.bbva.model.Query;

/**
 * Created by jorge on 10/07/17.
 */

public interface MapService {

    public abstract Query getQueueLength(String queue);

}