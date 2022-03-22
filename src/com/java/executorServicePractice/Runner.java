package com.java.executorServicePractice;

import java.util.concurrent.Callable;

public class Runner implements Callable<Boolean> {
    @Override
    public Boolean call() throws Exception {
        RunningService service = new RunningService();
        return service.running();
    }
}
