package cn.zlq.thread;

import java.util.concurrent.TimeUnit;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 16:18 2022/3/28
 * @ Description：wait()方法,和notifyall()  wait方法释放对象锁
 *
 */
public class ThreadDemo {
	private static boolean flag = true;
	private static Object lock = new Object();
	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(()->{
			synchronized (lock) {
				while (flag) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("unlock");
			}

		},"waitThread");
		Thread thread2 = new Thread(() -> {
			synchronized (lock) {
				while (flag) {
					System.out.println("hold lock");
					lock.notifyAll();
					flag = false;
					try {
						TimeUnit.SECONDS.sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			synchronized (lock) {
				System.out.println("holdlock again");
				try {
					TimeUnit.SECONDS.sleep(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		},"unlockThread");
		thread1.start();
		TimeUnit.SECONDS.sleep(1);
		thread2.start();
	}

}
