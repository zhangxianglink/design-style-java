package com.will;

import com.will.pojo.Noodles;

import java.util.ArrayList;

public class NoodlesStore implements Product{
    private ArrayList<Noodles> list = new ArrayList<Noodles>();

    private String name;

    private Double basePrice;

    public NoodlesStore(){

    }

    public NoodlesStore(String name,Double basePrice){
        this.name = name;
        this.basePrice = basePrice;
    }

    @Override
    public Product addOne(Noodles noodles) {
        list.add(noodles);
        basePrice +=  noodles.price();
        return this;
    }

    @Override
    public Product addTwo(Noodles noodles) {
        list.add(noodles);
        basePrice +=  noodles.price();
        return this;
    }

    @Override
    public Product addThree(Noodles noodles) {
        list.add(noodles);
        basePrice +=  noodles.price();
        return this;
    }

    @Override
    public String getDetail() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("  ").append(basePrice).append("\n");
        list.forEach(e -> sb.append(e.name()).append(" ").append(e.from()).append("  ").append(e.price()).append("\n"));
        return sb.toString();
    }

}
