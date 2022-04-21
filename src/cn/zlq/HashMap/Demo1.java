package cn.zlq.HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 22:03 2022/2/7
 * @ Description：
 */
public class Demo1 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		Map<String, String> map1 = new ConcurrentHashMap<>();
		Map<String, String> map2 = Collections.synchronizedMap(new HashMap<>());

	}
}
