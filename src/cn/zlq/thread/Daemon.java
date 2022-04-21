package cn.zlq.thread;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 13:33 2022/3/28
 * @ Description：
 */
public class Daemon {
	public static void main(String[] args) {
		System.out.println("1");
		Thread thread1 = new Thread(() -> {
			try {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				System.out.println("守护进程结束了");
			}
		},"DaemonThread");
		thread1.setDaemon(true);
		thread1.start();
		System.out.println("activeThread-->"+Thread.activeCount());
		System.out.println("ThreadName-->"+Thread.currentThread().getName());
	}
}
