package cn.zlq.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 14:13 2022/2/8
 * @ Description：公平锁和非公平锁
 * ReentrantLock默认是非公平锁
 * <p>
 * 公平锁:多个线程按照申请锁的顺序去获得锁，线程会直接进入队列去排队，永远都是队列的第一位才能得到锁。
 * 优点：所有的线程都能得到资源，不会饿死在队列中。
 * 缺点：吞吐量会下降很多，队列里面除了第一个线程，其他的线程都会阻塞，cpu唤醒阻塞线程的开销会很大。
 * <p>
 * 非公平锁：多个线程去获取锁的时候，会直接去尝试获取，获取不到，再去进入等待队列，如果能获取到，就直接获取到锁。
 * 优点：可以减少CPU唤醒线程的开销，整体的吞吐效率会高点，CPU也不必取唤醒所有线程，会减少唤起线程的数量。
 * 缺点：你们可能也发现了，这样可能导致队列中间的线程一直获取不到锁或者长时间获取不到锁，导致饿死。
 */

public class Demo1 {
	//不公平锁
	private static Lock lock = new ReentrantLock();

	//公平锁
	private static Lock lock2 = new ReentrantLock(true);

	public static void main(String[] args) {
		lock.lock();
	}
}
