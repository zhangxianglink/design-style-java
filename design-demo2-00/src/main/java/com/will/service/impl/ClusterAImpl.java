package com.will.service.impl;

import com.will.service.CacheService;

import java.util.HashMap;

public class ClusterAImpl implements CacheService {

    // 模拟服务A
    private static HashMap<String,String> clusterA = new HashMap<>();

    @Override
    public Object set(String key, String value) {
        return clusterA.put(key,value);
    }

    @Override
    public String get(String key) {
        return clusterA.get(key);
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
        return clusterA.put(key,value);
    }

    @Override
    public Object del(String key) {
        return clusterA.remove(key);
    }

    @Override
    public void show() {
        System.out.println("this is ClusterAImpl");
    }
}
