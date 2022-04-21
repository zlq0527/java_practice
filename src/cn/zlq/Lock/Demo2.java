package cn.zlq.Lock;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 16:25 2022/2/8
 * @ Description：
 */
class Demo2 {

	public static void main(String[] args) {
		Phone phone = new Phone();
		new Thread(() -> {
			phone.Sendmes();
		}, "T1").start();

		new Thread(() -> {
			phone.Sendmes();
		}, "T2").start();
	}
}

class Phone {
	public synchronized void Sendmes() {
		System.out.println(Thread.currentThread().getName() + "\t Sendmes");
		SendEmail();
	}

	public synchronized void SendEmail() {
		System.out.println(Thread.currentThread().getName() + "\t SendEmail");
	}
}
