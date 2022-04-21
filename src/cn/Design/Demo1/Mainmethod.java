package cn.Design.Demo1;

import cn.Design.Demo1.Lock.LockA;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 09:02 2022/3/3
 * @ Description：设计模式之--单一职责
 */
public class Mainmethod {
	public static void main(String[] args) {
		DataOperator dataOperator = new DataOperator();
		dataOperator.getlockA();
		dataOperator.getlockB();
	}
}
