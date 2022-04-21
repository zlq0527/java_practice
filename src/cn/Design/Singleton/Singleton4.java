package cn.Design.Singleton;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 11:11 2022/2/6
 * @ Description：饿汉式,因为声明instance实例的时候 用的是static和final
 * 第一次加载到内存中就会初始化,所以创建实例本身就是线程安全的
 * 这种写法如果完美的话，就没必要在啰嗦那么多双检锁的问题了。
 * 缺点是它不是一种懒加载模式（lazy initialization），单例会在加载类后一开始就被初始化，
 * 即使客户端没有调用 getInstance()方法。饿汉式的创建方式在一些场景中将无法使用：
 * 譬如 Singleton 实例的创建是依赖参数或者配置文件的，在 getInstance() 之前必须调用某个方法设置参数给它，
 * 那样这种单例写法就无法使用了。
 */
public class Singleton4 {
	private static final Singleton4 instance = new Singleton4();

	private Singleton4() {
		System.out.println(Thread.currentThread().getName());
	}

	public static Singleton4 getInstance() {
		return instance;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Thread(() -> {
				Singleton4.getInstance();
			}).start();
		}
	}
}
