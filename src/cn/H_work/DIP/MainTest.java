package cn.H_work.DIP;

import cn.H_work.DIP.Pojo.People;
import cn.H_work.DIP.Service.Coatimpl;
import cn.H_work.DIP.Service.Pantsimpl;
import cn.H_work.DIP.Service.Shoesimpl;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 08:46 2022/4/14
 * @ Description：
 */
public class MainTest {
	public static void main(String[] args) {
		People people = new People();
		people.setCoat(new Coatimpl());
		people.setShoes(new Shoesimpl());
		people.setPants(new Pantsimpl());
		people.look();
	}
}
