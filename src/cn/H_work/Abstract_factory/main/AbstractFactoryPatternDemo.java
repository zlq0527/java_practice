package cn.H_work.Abstract_factory.main;

import cn.H_work.Abstract_factory.AbstractFactory;
import cn.H_work.Abstract_factory.Color;
import cn.H_work.Abstract_factory.FactoryProducer;
import cn.H_work.Abstract_factory.Shape;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 08:57 2022/4/21
 * @ Description：
 */
public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		AbstractFactory shapefactory = FactoryProducer.getFactory("SHAPE");
		Shape circle = shapefactory.getshape("CIRCLE");
		circle.draw();
		Shape rectangle = shapefactory.getshape("rectangle");
		rectangle.draw();
		Shape square = shapefactory.getshape("square");
		square.draw();
		AbstractFactory colorfactory = FactoryProducer.getFactory("Color");
		Color red = colorfactory.getcolor("red");
		red.fill();
		Color blue = colorfactory.getcolor("blue");
		blue.fill();
		Color green = colorfactory.getcolor("green");
		green.fill();

	}
}
