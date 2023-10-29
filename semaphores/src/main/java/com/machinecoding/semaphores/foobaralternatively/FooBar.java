package com.machinecoding.semaphores.foobaralternatively;

import java.util.concurrent.Semaphore;

public class FooBar {

    private int n = 0;

    Semaphore s1 = null;
    Semaphore s2 = null;

    public FooBar(int n)
    {
        this.n = n;
        this.s1 = new Semaphore(1);
        this.s2 = new Semaphore(0);
    }

    public void foo() throws InterruptedException {
        for (int i = 0; i < this.n; i++) {
            this.s1.acquire();
            System.out.println("foo");
            this.s2.release();
        }
    }

    public void bar() throws InterruptedException {
        for (int i = 0; i < this.n; i++) {
            this.s2.acquire();
            System.out.println("bar");
            this.s1.release();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        FooBar foobar = new FooBar(5);
        FooThread fooThread = new FooThread(foobar);
        BarThread barThread = new BarThread(foobar);

        fooThread.start();
        barThread.start();

    }


}