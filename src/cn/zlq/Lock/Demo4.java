package cn.zlq.Lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 10:27 2022/2/9
 * @ Description：互斥锁:尝试获取锁的线程会进入阻塞状态,
 * 自旋锁 尝试获取锁时不会立马进入阻塞状态,
 * 而是采用循环的方式获取锁,这样的好处是减少上下文切换,缺点是不停的循环会消耗CPU资源,
 * <p>
 * 自己理解自旋锁:一个线程持有锁时,他的竞争线程就会不停的自旋,判断锁是否被释放,当锁被释放,等待线程立马就能持有锁
 */
public class Demo4 {
	AtomicReference<Thread> atomicReference = new AtomicReference<>();

	public void lock() {
		Thread thread = Thread.currentThread();
		System.out.println(Thread.currentThread().getName() + "\t 进入");
		while (!atomicReference.compareAndSet(null, thread)) {
		}
	}

	public void unlock() {
		Thread thread = Thread.currentThread();
		atomicReference.compareAndSet(thread, null);
		System.out.println(Thread.currentThread().getName() + "\t 退出");
	}

	public static void main(String[] args) {
		Demo4 demo4 = new Demo4();
		new Thread(() -> {
			demo4.lock();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			demo4.unlock();
		}, "A").start();

		new Thread(() -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			demo4.lock();
			demo4.unlock();
		}, "B").start();
	}
}
