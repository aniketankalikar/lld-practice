package com.machinecoding.concurrency.threads;

import java.util.Date;

public class MyRunnableThread1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread name "+Thread.currentThread().getName()+"  : "+new Date());
    }
}
