package cn.zlq.thread;
/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 23:21 2022/2/1
 * @ Description：
 */
public class Task implements Runnable {
	private static synchronized void threadtest() {
		System.out.println(Thread.currentThread().getName() + "获取到了锁");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "释放锁");
	}
	public static void main(String[] args) {
		new Thread(new Task()).start();
		new Thread(new Task()).start();
	}
	@Override
	public void run() {
		threadtest();
	}
}
