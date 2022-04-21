package cn.zlq.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 16:52 2022/2/8
 * @ Description：ReentrantLock也是可重用(可重入)锁
 */
public class Demo3 {
	static class Test {
		Lock lock = new ReentrantLock();

		public void Sendmes() {
			lock.lock();
			System.out.println(Thread.currentThread().getName() + "\tSendmes");
			Sendemail();
			lock.unlock();
		}

		public void Sendemail() {
			lock.lock();
			System.out.println(Thread.currentThread().getName() + "\tSendemail");
			lock.unlock();
		}
	}

	public static void main(String[] args) {
		Test test = new Test();
		new Thread(() -> {
			test.Sendmes();
		}).start();

	}
}
