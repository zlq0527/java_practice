package cn.zlq.ThreadPool;

import java.time.Instant;
import java.util.concurrent.*;

/**
 * @ Author     ：赵棱泉. @ Date       ：Created in 14:40 2022/2/6 @ Description：线程池的使用
 */
public class ThreadPoolDemo {
	private static final int CORE_POOL_SIZE = 5;
	private static final int MAX_POOL_SIZE = 10;
	private static final int QUEUE_CAPACITY = 100;
	private static final Long KEEP_ALIVE_TIME = 1L;

	public static void main(String[] args) {
		ThreadPoolExecutor executor = new ThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE, KEEP_ALIVE_TIME, TimeUnit.SECONDS, new ArrayBlockingQueue<>(QUEUE_CAPACITY), new ThreadPoolExecutor.CallerRunsPolicy());
		for (int i = 0; i < 10; i++)
			executor.execute(() -> {
				try {
					Thread.sleep(2000);
					System.out.println("CurrentThread name: " + Thread.currentThread().getName() + "   Date now :  " + Instant.now());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
		executor.shutdown();
		try {
			executor.awaitTermination(3, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("exit safety");
	}
}
