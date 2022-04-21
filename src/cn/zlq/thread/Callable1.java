package cn.zlq.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 19:42 2022/3/8
 * @ Description：
 */
public class Callable1 {
	public static void main(String[] args) throws Exception {
//		new Thread(new Runable1(), "RunnableName").start();
		FutureTask<Integer> futureTask = new FutureTask<>(new CallTest());
		//lambda表达式优化
//		FutureTask<String> futureTask1=new FutureTask<>(()-> "lambda表达式优化");
//
//		new Thread(futureTask1).start();
//		System.out.println("Callable接口(lambda表达式)返回数据"+futureTask1.get());

		new Thread(futureTask).start();
		System.out.println("Callable接口返回数据" + futureTask.get());
	}
}

//Callable方式实现多线程
class CallTest implements Callable {
	@Override
	public Integer call()  {
		int a=0;
		try {
			a = 1 / 0;
		} catch (Exception e) {
			System.out.println("捕获异常");
			e.printStackTrace();
		}
		return a;
	}
}

//Runnable方式实现多线程
class Runable1 implements Runnable {
	@Override
	public void run() {
		System.out.println("111");
	}
}
