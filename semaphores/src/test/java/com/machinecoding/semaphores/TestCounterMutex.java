package com.machinecoding.semaphores;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class TestCounterMutex
{


    @Test
    public void testBlocking()
    {
        int count = 5;
        ExecutorService executorService = Executors.newFixedThreadPool(count);
        CounterUsingMutex counter = new CounterUsingMutex();
        IntStream.range(0,count).forEach(user->executorService.execute(()->{
            try
            {
                counter.increase();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }));

        executorService.shutdown();
        Assert.assertTrue(counter.hasQueueThreads());
    }

    //@Test
    public void givenMutexAndMultipleThreads_ThenDelay_thenCorrectCount()
            throws InterruptedException {
        int count = 5;
        ExecutorService executorService
                = Executors.newFixedThreadPool(count);
        CounterUsingMutex counter = new CounterUsingMutex();
        IntStream.range(0, count)
                .forEach(user -> executorService.execute(() -> {
                    try {
                        counter.increase();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }));
        executorService.shutdown();

        Assert.assertTrue(counter.hasQueueThreads());
        Thread.sleep(5000);
        Assert.assertFalse(counter.hasQueueThreads());
        Assert.assertEquals(count, counter.getCount());
    }
}
