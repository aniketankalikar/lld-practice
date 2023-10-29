package com.machinecoding.concurrency;

import com.machinecoding.concurrency.threads.MyRunnableThread2;
import com.machinecoding.concurrency.threads.MyThread2;
import org.junit.Test;

public class TestThread {

    @Test
    public static void main(String[] args) {

        MyRunnableThread2 myRunnableThread = new MyRunnableThread2();
        myRunnableThread.run();

        MyThread2 thread2 = new MyThread2();
        thread2.start();

    }
}
