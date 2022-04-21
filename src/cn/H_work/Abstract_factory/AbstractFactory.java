package cn.H_work.Abstract_factory;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 08:51 2022/4/21
 * @ Description：
 */
public abstract class AbstractFactory {
	public abstract Color getcolor(String color);
	public abstract Shape getshape(String shape);
}
