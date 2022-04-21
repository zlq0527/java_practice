package cn.zlq.ThreadPool;

import java.util.Stack;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 16:38 2022/3/7
 * @ Description：
 */
public class ThreadPoolDemo01 {
	static AtomicInteger integer = new AtomicInteger();
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(() -> {
//			synchronized (integer) {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + ">>>>>>" + integer);
					integer.incrementAndGet();
				}
//			}
		});
		ThreadPoolExecutor executor = new ThreadPoolExecutor(
				2,
				4,
				5,
				TimeUnit.SECONDS,
				new LinkedBlockingQueue<>());
		for (int i = 0; i < 5; i++) {
			executor.execute(thread);
		}
		executor.shutdown();
	}
}
