package com.machinecoding.semaphores.foobaralternatively;

public class FooThread extends Thread{

    private FooBar foobar;

    public FooThread(FooBar foobar)
    {
        this.foobar = foobar;
    }

    @Override
    public void run()
    {
        try {
            this.foobar.foo();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
