package cn.Design.Singleton;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 09:24 2022/3/4
 * @ Description：静态内部类方法实现单例模式
 */
public class SingletonStatic {

	private SingletonStatic() {
	}

	private  static class Singleton{
		private static SingletonStatic singletonStatic=new SingletonStatic();
	}

	public static SingletonStatic getSingleton() {
		return Singleton.singletonStatic;
	}

	public static void main(String[] args) {
		new Thread(()->{
			for (int i = 0; i < 100; i++) {
				System.out.println(SingletonStatic.getSingleton());
			}
		}).start();
	}
}
