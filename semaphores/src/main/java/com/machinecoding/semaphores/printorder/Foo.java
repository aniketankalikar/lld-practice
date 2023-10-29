package com.machinecoding.semaphores.printorder;

public class Foo implements Runnable {

    String input;

    public Foo(String input) {
        this.input = input;
    }

    @Override
    public void run() {
        System.out.println(this.input);
    }
}