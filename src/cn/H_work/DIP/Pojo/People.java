package cn.H_work.DIP.Pojo;

import cn.H_work.DIP.Service.Coat;
import cn.H_work.DIP.Service.Pants;
import cn.H_work.DIP.Service.Shoes;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 08:44 2022/4/14
 * @ Description：
 */
public class People {
	private Coat coat;
	private Pants pants;
	private Shoes shoes;

	public Shoes getShoes() {
		return shoes;
	}

	public void setShoes(Shoes shoes) {
		this.shoes = shoes;
	}

	public Coat getCoat() {
		return coat;
	}

	public void setCoat(Coat coat) {
		this.coat = coat;
	}

	public Pants getPants() {
		return pants;
	}

	public void setPants(Pants pants) {
		this.pants = pants;
	}

	public void look() {
		System.out.println("看看我今天的穿搭");
		System.out.print("上衣选择-->");
		coat.Choice_Coat();
		System.out.print("裤子选择-->");
		pants.Choice_Pants();
		System.out.print("鞋子选择-->");
		shoes.Choice_Shoes();
	}
}
