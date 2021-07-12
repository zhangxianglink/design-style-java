package com.will.pojo;

public class Three implements Noodles{
    @Override
    public String name() {
        return "竹升面";
    }

    @Override
    public String from() {
        return "大陆";
    }

    @Override
    public Double price() {
        return 6D;
    }
}
