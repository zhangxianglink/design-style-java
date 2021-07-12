package com.will.pojo;

public class One implements Noodles{
    @Override
    public String name() {
        return "叉烧";
    }

    @Override
    public String from() {
        return "台湾";
    }

    @Override
    public Double price() {
        return 12D;
    }
}
