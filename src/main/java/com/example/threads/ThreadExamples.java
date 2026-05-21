package com.example.threads;

import java.util.concurrent.*;

public class ThreadExamples {
    public static void ThreadCreateExample() {
        System.out.println("[1] Current Thread: " + Thread.currentThread().getName());
        // create a thread
        Thread thread = new Thread(() -> {
            System.out.println("[2] Current Thread: " + Thread.currentThread().getName());
        });
        thread.setName("MyThread");
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } // wait for the thread to finish
        System.out.println("[3] Current Thread: " + Thread.currentThread().getName());
    }

    public static void SystemInfoExample() {
        System.out.println("Processor: " + System.getenv("PROCESSOR_IDENTIFIER"));
        System.out.println("Memory: " + Runtime.getRuntime().maxMemory() / 1024 / 1024 + " MB");
        System.out.println("CPU Cores: " + Runtime.getRuntime().availableProcessors());
        System.out.println("OS: " + System.getProperty("os.name"));
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
    }

    public static void ThreadGroupExample() {
        ThreadGroup group = new ThreadGroup("MyThreadGroup");
        Thread thread1 = new Thread(group, () -> {
            System.out.println("Thread 1 in group: " + Thread.currentThread().getName());
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(group, () -> {
            System.out.println("Thread 2 in group: " + Thread.currentThread().getName());
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.start();
        thread2.start();
        thread2.setDaemon(true);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } // wait for threads to start
        group.list();
        // group.interrupt(); // interrupt all threads in the group
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void ThreadPoolExecutorExample() throws ExecutionException, InterruptedException {
        Future<Integer> future;
        // set thread pool name as myThreadPool

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,
                3,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2),
                new ThreadPoolExecutor.CallerRunsPolicy()
        );
        executor.execute(new SleepTask("Task1"));
        executor.execute(new SleepTask("Task2"));
        executor.execute(new SleepTask("Task3"));
        executor.execute(new SleepTask("Task4"));
        executor.execute(new SleepTask("Task5"));
            executor.execute(new SleepTask("Task6"));
            executor.execute(new SleepTask("Task7"));
        System.out.println("[5] Pool size: " + executor.getPoolSize());
//
//            future = executor.submit(() -> {
//                System.out.println("Thread 2 in group: " + Thread.currentThread().getName());
//                Thread.sleep(10000);
//                return 100;
//            });

//            System.out.println("Pool size: " + executor.getPoolSize());
//
//        Integer result = future.get();
//        System.out.println("Result: " + result);
        //executor.shutdown();
    }

}
