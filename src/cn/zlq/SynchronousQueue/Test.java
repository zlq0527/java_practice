package cn.zlq.SynchronousQueue;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 14:34 2022/4/15
 * @ Description：
 */

public class Test {
	public static void main(String[] args) throws InterruptedException {
		SynchronousQueue<Integer> queue = new SynchronousQueue<>();
		Thread thread1 = new Thread(() -> {
			System.out.println("put thread start");
			try {
				queue.put(1);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("put thread end");
		});
		Thread thread2 = new Thread(() -> {
			System.out.println("take thread start");
			try {
				System.out.println("take from putThread: " + queue.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("take thread end");
		});
		thread1.start();
		Thread.sleep(1000);
		thread2.start();
	}
}
