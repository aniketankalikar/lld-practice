package com.machinecoding.semaphores.printorder;

import java.util.concurrent.Semaphore;

public class TestPrinOrder {

    public static void main(String[] args) throws InterruptedException {

        Foo first = new Foo("First");
        Foo second = new Foo("Second");
        Foo third = new Foo("Third");

        Semaphore s1 = new Semaphore(1);
        Semaphore s2 = new Semaphore(0);
        Semaphore s3 = new Semaphore(0);


        s1.acquire();
        first.run();
        s2.release();
        s2.acquire();
        second.run();
        s3.release();
        s3.acquire();
        third.run();

    }
}
