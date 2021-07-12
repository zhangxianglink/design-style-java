package com.will.factory.impl;

import com.will.service.CacheService;
import com.will.factory.ClusterFactory;
import com.will.service.impl.ClusterBImpl;

public class ClusterBFactory implements ClusterFactory {

    private ClusterBFactory(){}

    private static class ClusterBFactoryHelper {
        private static final ClusterBFactory INSTANCE = new ClusterBFactory();
    }

    public static ClusterBFactory getInstance() {
        return ClusterBFactoryHelper.INSTANCE;
    }
    @Override
    public CacheService CreateService() {
        return new ClusterBImpl();
    }
}
