package com.machinecoding.semaphores.foobaralternatively;

public class BarThread extends Thread{

    private FooBar foobar;

    public BarThread(FooBar foobar)
    {
        this.foobar = foobar;
    }

    @Override
    public void run()
    {
        try {
            this.foobar.bar();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
