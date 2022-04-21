package cn.zlq.thread;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 22:50 2022/2/3
 * @ Description：
 */
public class volatileDemo {
	volatile int a = 0;
	volatile boolean flag = false;

	static class ThreadA implements Runnable {
		volatileDemo volatileDemo = new volatileDemo();

		@Override
		public void run() {
			volatileDemo.a = 1;
			volatileDemo.flag = true;
//               a=1;
//               flag=true;
		}
	}

	//     static class ThreadB implements Runnable{
//          @Override
//          public void run() {
//               if (flag) {
//                    System.out.println(a);
//                    System.out.println(flag);
//               }else {
//                    System.out.println(a);
//                    System.out.println("没取到");
//               }
//          }
//     }
	public static void main(String[] args) throws InterruptedException {
//          Thread threadA = new Thread(new ThreadA());
//          Thread threadB = new Thread(new ThreadB());
//          threadA.start();
//          Thread.sleep(1000);
//          threadB.start();

		Mydate mydate = new Mydate();
		new Thread(() -> {
			System.out.println(Thread.currentThread().getName() + "进来了");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			mydate.addto60();
		}, "A").start();
		while (mydate.a == 0) {

		}
		System.out.println(mydate.a);
		System.out.println(Thread.currentThread().getName() + "退出了");
//          Mydate mydate=new Mydate();
//          for (int i = 0; i < 20; i++) {
//               new Thread(()->{
//                    for (int j = 0; j < 1000; j++) {
//                         mydate.add();
//                    }
//               }).start();
//          }
//          while (Thread.activeCount() > 2) {
//               Thread.yield();
//          }
//          System.out.println(Thread.currentThread().getName()+mydate.a);
	}

	public static class Mydate {
		int a = 0;

		public void addto60() {
			this.a = 60;
		}

		public void add() {
			a++;
		}
	}
}
