package com.will.service;

public interface CacheService {

    Object set(String key, String value);

    String get(String key);

    Object setNxTime(String key,String value, Integer mill, Boolean bool);

    Object del(String key);

    void show();
}
