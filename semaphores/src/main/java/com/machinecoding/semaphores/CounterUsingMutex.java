package com.machinecoding.semaphores;

import java.util.concurrent.Semaphore;

public class CounterUsingMutex {

    private Semaphore mutex;
    private int count;

    public CounterUsingMutex()
    {
        mutex = new Semaphore(1);
        count = 0;
    }

    public void increase() throws InterruptedException
    {
        mutex.acquire();
        this.count = this.count+1;
        Thread.sleep(1000);
        mutex.release();

    }

    int getCount()
    {
        return this.count;
    }

    boolean hasQueueThreads()
    {
        return mutex.hasQueuedThreads();
    }
}