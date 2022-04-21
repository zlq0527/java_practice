package cn.zlq.HashSet;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 21:50 2022/2/7
 * @ Description：HashSet 线程不安全
 * HashSet的底层是
 * public HashSet() {
 * map = new HashMap<>();
 * }
 * HashSet中add方法的源码
 * public boolean add(E e) {
 * return map.put(e, PRESENT)==null;
 * }
 */
public class Demo1 {
	public static void main(String[] args) {
//		Set<String> set = Collections.synchronizedSet(new HashSet<>());
//		Set<String> set = new CopyOnWriteArraySet<>(new HashSet<>());
		Set<String> set = new HashSet<>();
		set.add("Hello");

		for (int i = 0; i < 30; i++)
			new Thread(() -> {
				set.add(UUID.randomUUID().toString().substring(0, 8));
				System.out.println(set);
			}).start();
	}
}
