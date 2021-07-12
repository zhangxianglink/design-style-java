package com.will;

import com.will.service.InitPaper;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        InitPaper initPaper = new InitPaper();
        System.out.println(initPaper.createPaper("will", "007"));
        System.out.println(initPaper.createPaper("jack", "001"));
        System.out.println(initPaper.createPaper("rose", "006"));
    }
}
