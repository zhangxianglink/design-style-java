package com.will.factory;

import com.will.pojo.RespData;
import com.will.service.CoffeeDataService;
import com.will.service.PSDService;

public class CoffeeDataFactory implements PSDFactory{

    @Override
    public PSDService createFactory() {
        return new CoffeeDataService();
    }

}
