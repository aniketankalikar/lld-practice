package com.machinecoding.concurrency;

public class MyThread extends Thread{

    Integer i = 0;
    public  MyThread(Integer i)
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
