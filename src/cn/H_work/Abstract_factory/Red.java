package cn.H_work.Abstract_factory;

import cn.H_work.Abstract_factory.Color;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 08:49 2022/4/21
 * @ Description：
 */
public class Red implements Color {
	@Override
	public void fill() {
		System.out.println("filled with red");
	}
}
