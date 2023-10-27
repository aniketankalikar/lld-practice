package com.machinecoding.semaphores;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.concurrent.Semaphore;


@AllArgsConstructor
@NoArgsConstructor
public class LoginQueueUsingSemaphores {

    private Semaphore semaphore;

    public LoginQueueUsingSemaphores(int slotLimit)
    {
        semaphore = new Semaphore(slotLimit);
    }

    boolean tryLogin()
    {
        System.out.println("Into tryLogin");
        return  semaphore.tryAcquire();
    }

    void logout()
    {
        System.out.println("logout");
        semaphore.release();
    }

    int availableSlots()
    {
        return semaphore.availablePermits();
    }


}