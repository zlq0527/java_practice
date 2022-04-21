package cn.zlq.ArrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 14:16 2022/3/25
 * @ Description：
 */
public class Demo2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("111");
		list.add("222");
		list.add("222");
		list.add("333");
		list.add("444");
		list.add("333");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("222")) {
				list.remove(i);
			}
		}
		System.out.println(Arrays.toString(list.toArray()));
		System.out.println(list);
	}
}
