package cn.zlq.ReadWriteLock;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 10:54 2022/2/9
 * @ Description：读写锁 读锁是共享锁,写锁是独占锁
 * 读 读可以共存
 * 写 写不能共存
 * 读 写不能共存
 */
public class Demo1 {
	ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

	public void Lock() {
		lock.readLock();
	}

//	public String get(key) {
//		String value = redis.get(key);
//		if (value == null) {
//			//代表缓存值过期
//			// 设置3min的超时，防止del操作失败的时候，下次缓存过期一直不能load db
//			if (redis.setnx(key_mutex, 1, 3 * 60) == 1) {w
//				//代表设置成功
//				value = db.get(key);
//				redis.set(key, value, expire_secs);
//				redis.del(key_mutex);
//			} else {
//				//这个时候代表同时候的其他线程已经load db并回设到缓存了，这时候重试获取缓存值即可
//				sleep(50);
//				get(key);
//				//重试
//			}
//		} else {
//			return value;
//		}
//	}


	//	String get(final String key) {
//		V v = redis.get(key);
//		String value = v.getValue();
//		long timeout = v.getTimeout();
//		if (v.timeout <= System.currentTimeMillis()) {
//			threadPool.execute(new Runnable() {
//				public void run() {
//					String keyMutex = "mutex:" + key;
//					if (redis.setnx(keyMutex, "1")) {
//						redis.expire(keyMutex, 3 * 60);
//						String dbValue = db.get(key);
//						redis.set(key, dbValue);
//						redis.delete(keyMutex);
//					}
//				}
//			});
//		}
//		return value;
//	}
	public static void main(String[] args) {

	}
}
