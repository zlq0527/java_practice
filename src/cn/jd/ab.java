package cn.jd;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ab {

    Queue<Integer> queue = new LinkedList<Integer>();
    int maxsize = 10;

    public static void main(String[] args) {
        ab ab = new ab();
        Thread thread = new Thread(ab.new Consumer());
        Thread thread1 = new Thread(ab.new productor());
        thread.start();
        thread1.start();

    }

    class Consumer implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (queue) {
                    if (queue.size() == 0) {
                        try {
                            System.out.println("消费完了");
                            queue.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println(queue.remove());
                        queue.notifyAll();
                    }
                }
            }
        }
    }
    public class productor implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (queue) {
                    if (queue.size() == maxsize) {
                        try {
                            queue.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        int a = new Random().nextInt(1000);
                        queue.add(a);
                        queue.notifyAll();
                    }
                }
            }
        }
    }
}


