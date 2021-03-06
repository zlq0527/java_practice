package cn.zlq.ThreadPool;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 16:44 2022/4/22
 * @ Description：
 */
public class ThreadPoolDemo02 {
	static AtomicInteger integer = new AtomicInteger(1000);

	public static void main(String[] args) {
		ThreadPoolExecutor executor = new ThreadPoolExecutor(6, 6, 5, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
		for (int i = 0; i < 5; i++) {
			synchronized (integer) {
				executor.submit(() -> {
					for (int j = 0; j < 200; j++) {
						System.out.println(Thread.currentThread().getName() + "卖出了第" + integer + "张票");
						integer.decrementAndGet();

					}
				});
			}

		}
		executor.shutdown();
	}
}
