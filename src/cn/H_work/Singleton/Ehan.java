package cn.H_work.Singleton;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 09:12 2022/4/14
 * @ Description：饿汉式 用static 和final修饰符修饰,在类加载后就初始化实例了 线程安全
 * 缺点是未实现按需加载的特点,及时不需要类的实例 也提前创建了.
 */
public class Ehan {
	private static final Ehan Instance = new Ehan();

	private Ehan() {}

	public static Ehan getInstance() {
		return Instance;
	}
}
