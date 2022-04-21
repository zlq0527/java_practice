package cn.NullpointException;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 16:29 2022/4/13
 * @ Description：
 */
public class Test1 {
	private String name="";

	public void setName(String name) {
		this.name = name;
	}
	public void print() {
		printString(name);
	}
	private void printString(String s) {
		System.out.println(s + " (" + s.length() + ")");
	}

	public static void main(String[] args) {

		Test1 test1 = new Test1();
		test1.setName("abc");
		test1.print();
//		Object a1 = null;
//		System.out.println(a1.hashCode());

	}
}
