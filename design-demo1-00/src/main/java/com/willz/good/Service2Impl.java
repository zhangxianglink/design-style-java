package com.willz.good;

import java.util.HashMap;

public class Service2Impl implements SendGiftService{
    @Override
    public void sendGift(String type, String uid, HashMap<String, Object> map) {
        System.out.println("------- Service2Impl ");
        System.out.println("------- type: " + type);
        System.out.println("------- uid: " + uid);
        System.out.println("------- map: " + map.toString());
    }
}
