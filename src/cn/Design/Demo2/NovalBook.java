package cn.Design.Demo2;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 09:13 2022/3/3
 * @ Description：
 */
public class NovalBook implements Book{
	private String bookname;
	private int bookprice;


	public NovalBook(String bookname, int bookprice) {
		this.bookname = bookname;
		this.bookprice = bookprice;
	}

	@Override
	public String getbookname() {
		return bookname;
	}

	@Override
	public int getbookprice() {
		return bookprice;
	}
}
