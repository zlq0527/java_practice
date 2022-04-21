package cn.Design.Factory_Pattern;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 10:33 2022/3/4
 * @ Description：
 */
public class FactoryDemo {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		shape shape1 = shapeFactory.getshape("CIRCULE");
		shape1.draw();


	}
}
