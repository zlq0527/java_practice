package cn.practice.nk;

import com.sun.corba.se.impl.orbutil.ObjectStreamClassUtil_1_3;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 11:47 2022/2/26
 * @ Description：重载 方法名必须相同
 *  参数类型 参数个数 参数顺序 不同 都构成重载
 *  两个参数类型相同 顺序不同 不构成重载
 */
public class Demo {
	public static void main(String[] args) {
		test(1);
		test(1, "2");
		test("2",1);

	}

	public static void test(int a,String b) {
		System.out.println(a);
		System.out.println(b);
		System.out.println("test");
	}

	public static void test(String b, int a) {
		System.out.println(b);
		System.out.println(a);
	}

	public static void test(int a) {
		System.out.println(a);
	}
}
