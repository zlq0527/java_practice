package cn.H_work.DIP.Service;

import cn.H_work.DIP.Service.Coat;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 08:46 2022/4/14
 * @ Description：
 */
public class Coatimpl implements Coat {
	@Override
	public void Choice_Coat() {
		System.out.println("黑色外套");
	}

	public void Choice_Coat2() {
		System.out.println("白色外套");
	}
}
