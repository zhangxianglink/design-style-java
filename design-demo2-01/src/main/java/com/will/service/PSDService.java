package com.will.service;

import com.will.pojo.CoffeeQuota;
import com.will.pojo.OpenDay;
import com.will.pojo.RespData;

public interface PSDService {

    RespData divide(CoffeeQuota coffeeQuota, OpenDay openDay);
}
