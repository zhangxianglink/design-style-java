package com.will.service;

import com.will.pojo.CoffeeQuota;
import com.will.pojo.OpenDay;
import com.will.pojo.RespData;

public class CoffeeDataService implements PSDService{
    @Override
    public RespData divide(CoffeeQuota coffeeQuota, OpenDay openDay) {
        RespData data = new RespData();
        data.setName(coffeeQuota.getName());
        data.setData(openDay.getDay(),coffeeQuota.getMoney());
        return data;
    }
}
