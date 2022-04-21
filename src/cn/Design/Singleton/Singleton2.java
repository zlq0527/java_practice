package cn.Design.Singleton;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 10:50 2022/2/6
 * @ Description：懒汉式 线程不安全
 */
public class Singleton2 {
	private static Singleton2 instance;

	private Singleton2() {
		System.out.println(Thread.currentThread().getName() + "init");
	}

	public static Singleton2 getinstance() {
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}


	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Thread(() -> {
				System.out.println(Singleton2.getinstance().hashCode());
			}).start();
		}

	}
}
