package cn.H_work.Abstract_factory;

import cn.H_work.Abstract_factory.Color;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 08:50 2022/4/21
 * @ Description：
 */
public class Green implements Color {
	@Override
	public void fill() {
		System.out.println("filled with green");
	}
}
