package com.will.factory.impl;

import com.will.service.CacheService;
import com.will.factory.ClusterFactory;
import com.will.service.impl.ClusterAImpl;

public class ClusterAFactory implements ClusterFactory {

    private ClusterAFactory(){}

    private static class ClusterAFactoryHelper {
        private static final ClusterAFactory INSTANCE = new ClusterAFactory();
    }

    public static ClusterAFactory getInstance() {
        return ClusterAFactoryHelper.INSTANCE;
    }

    @Override
    public CacheService CreateService() {
        return new ClusterAImpl();
    }
}
