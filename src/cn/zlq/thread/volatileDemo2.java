package cn.zlq.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 18:55 2022/2/4
 * @ Description：
 */
public class volatileDemo2 {
	public static class Demo {
		int a = 0;
		boolean flag = false;

		void change() {
			this.a = 1;
			this.flag = true;
		}
	}

	public static void main(String[] args) throws InterruptedException {

		Demo demo = new Demo();
		new Thread(() -> {
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
			demo.change();
		}).start();
		System.out.println(Thread.currentThread().getName() + "开始了");
		System.out.println(demo.flag);
		System.out.println(demo.a);
		while (!demo.flag && demo.a == 0) {

		}
		System.out.println(demo.flag);
		System.out.println(demo.a);
		System.out.println(Thread.currentThread().getName() + "over");
	}
}
