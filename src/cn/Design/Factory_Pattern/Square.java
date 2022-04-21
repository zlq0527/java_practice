package cn.Design.Factory_Pattern;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 10:27 2022/3/4
 * @ Description：
 */
public class Square implements shape{
	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}
