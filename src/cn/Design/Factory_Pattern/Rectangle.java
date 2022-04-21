package cn.Design.Factory_Pattern;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 10:28 2022/3/4
 * @ Description：
 */
public class Rectangle implements shape{
	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}
