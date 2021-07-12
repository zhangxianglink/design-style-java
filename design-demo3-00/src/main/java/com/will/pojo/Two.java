package com.will.pojo;

public class Two implements Noodles{
    @Override
    public String name() {
        return "骨汤";
    }

    @Override
    public String from() {
        return "日本";
    }

    @Override
    public Double price() {
        return 10D;
    }
}
