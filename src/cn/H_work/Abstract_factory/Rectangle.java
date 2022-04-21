package cn.H_work.Abstract_factory;

import cn.H_work.Abstract_factory.Shape;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 08:46 2022/4/21
 * @ Description：
 */
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}
