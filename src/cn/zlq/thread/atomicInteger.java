package cn.zlq.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 19:12 2022/2/4
 * @ Description：
 */
public class atomicInteger {
	public static void main(String[] args) {
		AtomicInteger atomicInteger = new AtomicInteger();
		atomicInteger.incrementAndGet();
		System.out.println(atomicInteger);
	}
}
