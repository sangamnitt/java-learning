package com.example.threads;
import java.util.concurrent.*;
import static com.example.threads.ThreadExamples.ThreadPoolExecutorExample;

public class ThreadTestMain {
    public static void main(String[] args) {
        try {
            ThreadPoolExecutorExample();
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
