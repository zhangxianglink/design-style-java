package com.willz;

public class main {
    public static void main(String[] args) {
        Runnable hello_world = () -> System.out.println("hello world");
        hello_world.run();
    }
}
