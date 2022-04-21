package cn.Design.Singleton;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 10:58 2022/2/6
 * @ Description：懒汉式,线程安全,因为getinstance方法加了synchronized锁,
 * 但是影响了效率
 */
public class Singleton3 {
	private static Singleton3 instance;

	private Singleton3() {
		System.out.println(Thread.currentThread().getName());
	}

	public static synchronized Singleton3 getInstance() {
		if (instance == null) {
			instance = new Singleton3();
		}
		return instance;
	}
}
