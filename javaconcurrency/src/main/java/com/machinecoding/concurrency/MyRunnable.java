package com.machinecoding.concurrency;

import java.util.Date;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread name "+Thread.currentThread().getName()+"  : "+new Date());
    }
}
