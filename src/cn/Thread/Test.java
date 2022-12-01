package cn.Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class Test {
    private static AtomicInteger count = new AtomicInteger(0);

    private static ExecutorService executorService;

    public static void main(String[] args) {
        executorService = Executors.newCachedThreadPool(r -> {
            count.getAndAdd(1);
            System.out.println("Thread" + count + ":" + Thread.currentThread().getName());
            return new Thread(r);
        });
        Future<String> future = executorService.submit(() -> {
            return "abc";
        });
    }
}
