package com.machinecoding.concurrency;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestThread {

    public static void main(String[] args) {

       /* IntStream stream = IntStream.of(1,2,3,4,5);
        stream.forEach(val ->{
            MyThread myTh  = new MyThread(val);
            myTh.start();
        });*/

        IntStream stream = IntStream.of(1,2,3,4,5);
        stream.forEach(val -> {
            MyRunnable obj = new MyRunnable();
            obj.run();
        });


    }
}
