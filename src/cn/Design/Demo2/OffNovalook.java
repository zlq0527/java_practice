package cn.Design.Demo2;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 09:20 2022/3/3
 * @ Description：
 */
public class OffNovalook extends NovalBook {

	public OffNovalook(String bookname, int bookprice) {
		super(bookname, bookprice);
	}

	@Override
	public int getbookprice() {
		return super.getbookprice()>40?(int) (super.getbookprice()*0.9):super.getbookprice();
	}
}
