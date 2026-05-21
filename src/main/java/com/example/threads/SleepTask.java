package com.example.threads;

public class SleepTask implements Runnable{
    private final int sleepTime;
    private final String name;

    public SleepTask(String name){
        this.sleepTime = 5000;
        this.name = name;
    }
    public SleepTask(int sleepTime, String name){
        this.sleepTime = sleepTime;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println("Task:" + name + " executed by thread:" + Thread.currentThread().getName());
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
