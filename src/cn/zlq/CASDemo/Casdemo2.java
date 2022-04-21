package cn.zlq.CASDemo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 18:59 2022/2/6
 * @ Description：ABA问题,一个线程把值修改了之后,又改为原来的值,
 * 另外一个线程读取了发现和旧值相同,误以为没有修改过
 */
public class Casdemo2 {
	public static void main(String[] args) {
		AtomicInteger atomicInteger = new AtomicInteger(10);
		new Thread(() -> {
			atomicInteger.compareAndSet(10, 11);
			atomicInteger.compareAndSet(11, 10);
		}, "张三").start();
		new Thread(() -> {
			try {
				TimeUnit.SECONDS.sleep(1);
				atomicInteger.compareAndSet(10, 20);
				System.out.println("没有修改过,很好!");
				System.out.println("那我就修改了!");
				System.out.println(atomicInteger.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}, "李四").start();
	}
}
