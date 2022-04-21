package cn.H_work.Abstract_factory;

import cn.H_work.Abstract_factory.Shape;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 08:48 2022/4/21
 * @ Description：
 */
public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}
