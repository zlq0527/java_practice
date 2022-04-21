package cn.Design.Demo2;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 09:15 2022/3/3
 * @ Description：设计模式之--开闭原则
 */
public class Test {
	public static void main(String[] args) {
		NovalBook novalBook = new NovalBook("love is pain", 39);
		System.out.println(novalBook.getbookname()+"--单价--"+novalBook.getbookprice());
		NovalBook novalBook1 = new OffNovalook("love is pain2", 38);
		System.out.println(novalBook1.getbookname()+" price ::"+novalBook1.getbookprice());
	}
}
