package com.machinecoding.concurrency.threads;

import java.util.stream.IntStream;

public class ThreadMain {

    public static void main(String[] args) {

       /* IntStream stream = IntStream.of(1,2,3,4,5);
        stream.forEach(val ->{
            MyThread myTh  = new MyThread(val);
            myTh.start();
        });*/

        IntStream stream = IntStream.of(1,2,3,4,5);
        stream.forEach(val -> {
            MyRunnableThread1 obj = new MyRunnableThread1();
            obj.run();
        });


    }
}
