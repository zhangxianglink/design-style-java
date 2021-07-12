package com.willz.good;

import java.util.HashMap;

public class GiftFactory {

    private GiftFactory(){
        map.put(1,new Service1Impl());
        map.put(2,new Service2Impl());
        map.put(3,new Service3Impl());
    }

    private static class GiftFactoryHelper {
        private static final GiftFactory INSTANCE = new GiftFactory();
    }

    public static GiftFactory getInstance(){
        return GiftFactoryHelper.INSTANCE;
    }

    private  HashMap<Integer,SendGiftService> map = new HashMap<>(3);

    public  SendGiftService getService(Integer num){
        return map.get(num);
    }
}
