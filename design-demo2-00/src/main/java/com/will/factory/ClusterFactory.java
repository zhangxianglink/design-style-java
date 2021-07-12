package com.will.factory;

import com.will.service.CacheService;
import com.will.factory.impl.ClusterAFactory;
import com.will.factory.impl.ClusterBFactory;

public interface ClusterFactory {

    CacheService CreateService();

    static   CacheService getService(Integer num){
        if (num == 1){
            return ClusterAFactory.getInstance().CreateService();
        }
        return ClusterBFactory.getInstance().CreateService();

    }
}
