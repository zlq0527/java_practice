package cn.zlq.thread;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 11:10 2022/2/2
 * @ Description：
 */
public class test2 {

	private static Object lock = new Object();

	public static void main(String[] args) throws InterruptedException {
		new Thread(() -> {
			synchronized (lock) {
				for (int i = 0; i < 5; i++) {
					try {
						System.out.println("Thread A" + i);
						lock.notify();
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					lock.notify();

				}
				lock.notify();
			}
		}).start();


		Thread.sleep(1000);
		new Thread(new Thread(() -> {
			synchronized (lock) {

				for (int i = 0; i < 5; i++) {
					try {
						System.out.println("Thread B" + i);
						lock.notify();
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					lock.notify();

				}
				lock.notify();
			}
		})).start();

	}
}
