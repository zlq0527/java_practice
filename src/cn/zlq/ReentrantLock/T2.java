package cn.zlq.ReentrantLock;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 09:48 2022/4/13
 * @ Description：不可重入锁
 */
public class T2 {
	private boolean islock = false;

	public synchronized void lock() throws InterruptedException {
		while (islock) {
			wait();
		}
		islock = true;
	}

	public void unlock() {
		islock = false;
		notify();
	}
}
