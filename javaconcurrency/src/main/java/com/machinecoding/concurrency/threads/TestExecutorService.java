package com.machinecoding.concurrency.threads;

import java.util.concurrent.*;

public class TestExecutorService {
    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Testing the Executor Service execute Method");
            }
        });

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Testing the Executor Service submit Method - Runnable");

            }
        });

        Future<Object> futureObj =  executorService.submit(new Callable<Object>() {
            @Override
            public Object call()
            {
                return "Testing the Executor Service submit Method - Callable";
            }
        });

        try {
            System.out.println(futureObj.get().toString());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
