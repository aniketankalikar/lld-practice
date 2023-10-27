package com.machinecoding.semaphores;


import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class TestSemaphore {

    //@Test
    public void reachLimitWithLogin()
    {
        int slots = 10;
        ExecutorService executorService = Executors.newFixedThreadPool(slots);
        LoginQueueUsingSemaphores obj = new LoginQueueUsingSemaphores(slots);

        IntStream.range(0,slots).forEach(user -> executorService.execute(obj::tryLogin));
        executorService.shutdown();
        Assert.assertEquals(0,obj.availableSlots());
        Assert.assertFalse(obj.tryLogin());
    }

    @Test
    public void availableSlots()
    {
        int slots = 10;
        ExecutorService executorService = Executors.newFixedThreadPool(slots);
        LoginQueueUsingSemaphores loginQueue = new LoginQueueUsingSemaphores(slots);
        IntStream.range(0, slots)
                .forEach(user -> executorService.execute(loginQueue::tryLogin));
        executorService.shutdown();
        Assert.assertEquals(1, loginQueue.availableSlots());
        loginQueue.logout();

        Assert.assertTrue(loginQueue.availableSlots() > 0);
        Assert.assertTrue(loginQueue.tryLogin());
    }


}
