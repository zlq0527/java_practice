package cn.Design.Demo1;

import cn.Design.Demo1.Lock.LockA;
import cn.Design.Demo1.Lock.LockB;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 09:02 2022/3/3
 * @ Description：
 */
public class DataOperator {

	LockA lockA = new LockA();
	LockA lockB = new LockB();

	public void getlockA(){
		lockA.lock();
	}

	public void getlockB() {
		lockB.lock();
	}
}
