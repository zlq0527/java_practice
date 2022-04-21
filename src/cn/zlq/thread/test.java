package cn.zlq.thread;


/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 11:09 2022/1/29
 * @ Description：
 */
public class test {
	int a = 0;
	boolean flag = false;

	void write() {
		this.a = 1;
		this.flag = true;
	}

	void sleep(int a) {
		try {
			Thread.sleep(a * 1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	void read() {
		if (flag) {
			System.out.println(a);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		test test1 = new test();
		Thread thread1 = new Thread(() -> {
			test1.sleep(2);
			test1.write();
		});
		thread1.start();
		System.out.println("main start");
		while (!test1.flag) {
		}
		System.out.println("over");
	}
}
