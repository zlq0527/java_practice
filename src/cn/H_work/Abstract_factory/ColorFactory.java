package cn.H_work.Abstract_factory;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 08:55 2022/4/21
 * @ Description：
 */
public class ColorFactory extends AbstractFactory {
	@Override
	public Color getcolor(String color) {
		if (color == null) {
			return null;
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		} else if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		}
		return null;
	}

	@Override
	public Shape getshape(String shape) {
		return null;
	}
}
