package cn.zlq.thread;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 09:52 2022/3/15
 * @ Description：
 */
public class test4 {
	private static volatile int i = 0;

	public static void main(String[] args) {
		for (int j = 0; j < 10; j++) {
			new Thread(() -> {
				for (int k = 0; k < 1000; k++) {
					i = i + 1;
				}
			}).start();
		}
		System.out.println(i);
	}
}
