package cn.zlq.thread;

import java.util.stream.Stream;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 16:44 2022/2/3
 * @ Description：
 */
public class ThreadLocalDemo {

	static class ThreadA implements Runnable {
		ThreadLocal<String> threadLocal;

		public ThreadA(ThreadLocal<String> threadLocal) {
			this.threadLocal = threadLocal;
		}

		@Override
		public void run() {
			threadLocal.set("A");
			System.out.println("threadA输出" + threadLocal.get());
		}
	}

	static class ThreadB implements Runnable {
		ThreadLocal<String> threadLocal;

		public ThreadB(ThreadLocal<String> threadLocal) {
			this.threadLocal = threadLocal;
		}

		@Override
		public void run() {
			threadLocal.set("B");
			System.out.println("threadB输出" + threadLocal.get());
		}
	}

	public static void main(String[] args) {
		ThreadLocal<String> threadLocal = new ThreadLocal<>();
		new Thread(new ThreadA(threadLocal)).start();
		new Thread(new ThreadB(threadLocal)).start();
	}
}
