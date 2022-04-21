package cn.H_work.Singleton;
/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 09:20 2022/4/14
 * @ Description：懒汉式 使用双检锁(Double Check Lock) 保证线程安全.
 */
public class LHan {
	private static LHan instance;
	private LHan() {}
	public static LHan getInstance() {
		if (instance == null) {
			synchronized (LHan.class) {
				if (instance == null) {
					instance = new LHan();
					return instance;
				}
			}
		}
		return instance;
	}
	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			new Thread(() -> {
				//多线程测试看是否是同一个对象  测试结果 是同一个对象
				System.out.println(LHan.getInstance().hashCode());
			}).start();
		}
	}
}

