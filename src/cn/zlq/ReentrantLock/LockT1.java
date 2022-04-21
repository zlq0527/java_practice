package cn.zlq.ReentrantLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 09:39 2022/4/13
 * @ Description：可重入锁
 */
public class LockT1 {
	private final Lock lock = new ReentrantLock();
	int value = 0;
	public static void main(String[] args) throws InterruptedException {
		LockT1 lockT1 = new LockT1();
		Thread thread = new Thread(()->lockT1.addone());
		thread.start();
		thread.join();
		System.out.println(lockT1.value);
	}

	public int get() {
		lock.lock();
		try {
			return value;
		} finally {
			lock.unlock();
		}
	}

	public void addone() {
		lock.lock();
		try {
			value = 1 + get();
		} finally {
			lock.unlock();
		}
	}
}
