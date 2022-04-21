package cn.zlq.thread;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 11:37 2022/2/2
 * @ Description：
 */
public class test3 {

	public static void main(String[] args) throws InterruptedException {

		Thread thread = new Thread(() -> {
			try {
				System.out.println("睡觉前");
				Thread.sleep(1000);
				System.out.println("睡过1秒了");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		thread.start();
		thread.join(1200);
		System.out.println("不然我先输出了");
	}
}
