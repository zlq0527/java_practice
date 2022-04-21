package cn.zlq.thread;

import com.sun.corba.se.spi.ior.ObjectKey;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 10:16 2022/2/3
 * @ Description：
 */
public class sharenum {
	static int i = 0;
	private static Object object = new Object();

	static class ThreadA implements Runnable {
		@Override
		public void run() {
//            synchronized (object) {
			System.out.println("A线程启动前i的值" + i);
			for (int j = 0; j < 500000; j++) {
				i++;
			}
			System.out.println("A线程启动后i的值" + i);
		}
//        }
	}

	static class ThreadB implements Runnable {
		@Override
		public void run() {
//            synchronized (object) {
			System.out.println("B线程启动前i的值" + i);
			for (int j = 0; j < 500000; j++) {
				i--;
			}
			System.out.println("B线程启动后i的值" + i);
		}
//        }
	}

	public static void main(String[] args) throws InterruptedException {

		new Thread(new ThreadA()).start();
		new Thread(new ThreadB()).start();
		new Thread(new ThreadA()).start();
		new Thread(new ThreadB()).start();
		Thread.sleep(100);
		System.out.println("最后i的值" + i);
		Thread.sleep(100);
		System.out.println("最后i的值" + i);

	}
}
