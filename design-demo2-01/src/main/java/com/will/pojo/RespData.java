package com.will.pojo;

public class RespData {
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "RespData{" +
                "name='" + name + '\'' +
                ", data=" + data +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getData() {
        return data;
    }

    public void setData(Integer day, Double money) {
        this.data = money / day;
    }

    private String name;

    private Double data;
}
