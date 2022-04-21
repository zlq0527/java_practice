package cn.zlq.ThreadPool;

import java.util.concurrent.*;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 16:38 2022/3/7
 * @ Description：
 */
public class ThreadPoolDemo01 {
	private static final Executor executors = Executors.newFixedThreadPool(5);
	static ExecutorService executorService = Executors.newFixedThreadPool(5);
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		FutureTask<Integer> futureTask = new FutureTask<Integer>(new Test());
		executorService.submit(new Test());
//		new Thread(futureTask).start();
		System.out.println(futureTask.get());
	}
}
class Test implements Callable {
	@Override
	public Integer call() throws Exception {
		int a=0;
		try {
			a = 1 / 0;
		} catch (Exception e){
			throw new RuntimeException("0不能做被除数");
		}
		return 0;
	}
}
