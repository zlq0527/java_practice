package cn.H_work.Abstract_factory;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 08:56 2022/4/21
 * @ Description：
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		return null;
	}
}
