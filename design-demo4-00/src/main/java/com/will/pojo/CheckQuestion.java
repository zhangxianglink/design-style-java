package com.will.pojo;

import java.util.Map;

public class CheckQuestion {

    private String key;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, String> getChooseMap() {
        return chooseMap;
    }

    public void setChooseMap(Map<String, String> chooseMap) {
        this.chooseMap = chooseMap;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public CheckQuestion() {
    }

    private String message;

    private Map<String,String> chooseMap;

    public CheckQuestion( String message, Map<String, String> chooseMap,String key) {
        this.key = key;
        this.message = message;
        this.chooseMap = chooseMap;
    }
}
