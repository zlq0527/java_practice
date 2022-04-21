package cn.zlq.ArrayListDemo;

import java.util.*;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 20:24 2022/2/7
 * @ Description：ArrayList 线程不安全 多线程环境下报错	java.util.ConcurrentModificationException
 * 解决方法
 * 1.new Vector<>()
 * 2.Collections.synchronizedList(new ArrayList<>());
 * 3.new CopyOnWriteArrayList<>();
 */
public class Demo1 {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
//		List<String> list = new Vector<>();
//		List<String> list = new CopyOnWriteArrayList<>();
		List<String> list = Collections.synchronizedList(new ArrayList<>());
		for (int i = 0; i < 30; i++)
			new Thread(() -> {
//				list.add(Thread.currentThread().getName());
				list.add(UUID.randomUUID().toString().substring(0, 8));
				System.out.println(list);
			}).start();
	}
}
