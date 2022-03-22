package com.java.executorServicePractice;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
public class MainService {

    public static void main(String args[]) throws InterruptedException {
        ExecutorService executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);

        executor.submit(new Runner());

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if(i == 1) {
            executor.shutdownNow();
        }
    }


}
