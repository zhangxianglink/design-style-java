package com.will.pojo;

import com.will.Builder;

import java.nio.Buffer;

public class main {
    public static void main(String[] args) {
        System.out.println(new Builder().oneProduct(6d).getDetail());
    }
}
