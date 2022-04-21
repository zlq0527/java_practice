package cn.H_work.Abstract_factory;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 08:52 2022/4/21
 * @ Description：
 */
public class ShapeFactory extends AbstractFactory{
	@Override
	public Color getcolor(String color) {
		return null;
	}

	@Override
	public Shape getshape(String shape) {
		if (shape == null) {
			return null;
		} else if (shape.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shape.equalsIgnoreCase("SQUARE")) {
			return new Square();
		} else if (shape.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		return null;
	}
}
