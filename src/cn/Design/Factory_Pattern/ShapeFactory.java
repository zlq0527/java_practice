package cn.Design.Factory_Pattern;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 10:29 2022/3/4
 * @ Description：
 */
public class ShapeFactory {
	public shape getshape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCULE")) {
			return new Circle();
		}if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}
}
