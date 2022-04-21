package cn.zlq.CASDemo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 19:47 2022/2/6
 * @ Description：原数值和新数值都不要超过Integer的范围     Integer常量池-128到127。
 */
public class Casdemo3 {
	private static AtomicStampedReference<Integer> stamp = new AtomicStampedReference<Integer>(10, 1);
	static volatile int firststamp = stamp.getStamp();

	public static void main(String[] args) {
		new Thread(() -> {
			stamp.compareAndSet(10, 20, stamp.getStamp(), stamp.getStamp() + 1);
			System.out.println("第1次修改后版本号为" + stamp.getStamp());
			stamp.compareAndSet(20, 10, stamp.getStamp(), stamp.getStamp() + 1);
			System.out.println("第2次修改后版本号为" + stamp.getStamp());
		}).start();

		new Thread(() -> {
			try {
				TimeUnit.SECONDS.sleep(2);
				boolean flag = stamp.compareAndSet(10, 100, firststamp, stamp.getStamp() + 1);
//                stamp.compareAndSet(10, 100, stamp.getStamp(), stamp.getStamp() + 1);
				if (flag) {
					System.out.println("修改成功");
				}
				System.out.println("修改失败,当前值为" + stamp.getReference());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}).start();
	}
}
