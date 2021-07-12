package com.will.service.impl;

import com.will.service.CacheService;

import java.util.HashMap;

public class ClusterBImpl implements CacheService {
    // 模拟服务B
    private static HashMap<String,String> clusterB = new HashMap<>();
    @Override
    public Object set(String key, String value) {
        return clusterB.put(key,value);
    }

    @Override
    public String get(String key) {
        return clusterB.get(key);
    }

    @Override
    public Object setNxTime(String key, String value, Integer mill, Boolean bool) {
        if (mill > 0){
            // do something
        }
        if (bool)
        {
            // do something
        }
        return clusterB.put(key,value);
    }

    @Override
    public Object del(String key) {
        return clusterB.remove(key);
    }
    @Override
    public void show() {
        System.out.println("this is ClusterBImpl");
    }
}
