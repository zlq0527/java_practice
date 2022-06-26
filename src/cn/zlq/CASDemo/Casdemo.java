package cn.zlq.CASDemo;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 12:20 2022/2/6
 * @ Description：
 */
public class Casdemo {
	public static void main(String[] args) {
//		AtomicInteger atomicInteger = new AtomicInteger(5);
//		atomicInteger.getAndIncrement();
//		atomicInteger.compareAndSet(5, 100);
//		System.out.println(atomicInteger.get());
		Integer integer = new Integer(100);
		int c = 100;
		Integer b = 100;
		System.out.println(c==integer);

	}
}
