package com.java.executorServicePractice;

public class RunningService {

    public boolean running() throws InterruptedException {
        int i = 0;
        while (i < 10) {
            System.out.println("Thread " + Thread.currentThread() + " loop " + i);
            Thread.sleep(10000);
            i++;
        }
        return true;
    }

}
