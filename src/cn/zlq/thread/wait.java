package cn.zlq.thread;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 11:32 2022/2/3
 * @ Description：
 */
public class wait {
	private static Object object = new Object();
	static boolean a = false;

	static class ThreadA implements Runnable {
		@Override
		public void run() {
			synchronized (object) {
				if (!a) {
					System.out.println("a是false");
					a = true;
					try {
						object.wait();
						System.out.println("一切都结束了");
						a = true;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	static class ThreadB implements Runnable {
		@Override
		public void run() {
			synchronized (object) {
				if (a) {
					System.out.println("a是T");
					a = false;
					object.notify();
					System.out.println("a被唤醒了吧");
					System.out.println("a被唤醒了吧");
				}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new ThreadA());
		Thread thread2 = new Thread(new ThreadB());
		thread1.start();
		thread2.start();
		thread2.join();
		System.out.println("a最后是" + a);
	}
}
