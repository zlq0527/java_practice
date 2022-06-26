package cn.zlq.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 08:36 2022/5/16
 * @ Description：
 */
public class M2 {
	public static void main(String[] args) {
		try {
			Class name = Class.forName("cn.zlq.reflect.TargetObject");
			Method method = name.getMethod("publicMethod", void.class);
			Constructor constructor = name.getConstructor();
			Object instance = constructor.newInstance();
			method.invoke(instance, "sss");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
