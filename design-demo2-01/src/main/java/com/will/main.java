package com.will;

import com.will.factory.CoffeeDataFactory;
import com.will.pojo.CoffeeQuota;
import com.will.pojo.OpenDay;
import com.will.pojo.RespData;

public class main {

    public static void main(String[] args) {
        CoffeeQuota quota = new CoffeeQuota();
        quota.setMoney(12.6);
        quota.setName("美式");
        OpenDay openDay = new OpenDay();
        openDay.setDay(2);

        CoffeeDataFactory factory = new CoffeeDataFactory();
        RespData divide = factory.createFactory().divide(quota, openDay);

        System.out.println(divide.toString());
    }
}
