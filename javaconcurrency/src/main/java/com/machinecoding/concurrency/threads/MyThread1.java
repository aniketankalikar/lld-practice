package com.machinecoding.concurrency.threads;

public class MyThread1 extends Thread{

    Integer i = 0;
    public MyThread1(Integer i)
    {
        this.i=i;
    }

    @Override
    public void start()
    {
        super.start();
        System.out.println("Cuurent Thrad "+this.getThreadGroup().getName()+" : val is "+i);
    }
}
