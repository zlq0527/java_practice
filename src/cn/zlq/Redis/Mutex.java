package cn.zlq.Redis;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 13:58 2022/4/25
 * @ Description：Redis 实现互斥锁 解决缓存击穿问题.
 */
public class Mutex {

//	public String get(key) {
//		String value = redis.get(key);
//		if (value == null) {
//			if (redis.setnx(key_mutex, 1, 3 * 60) == 1) {
//				String value1 = db.get(key);
//				redis.set(value1, expiretime);
//				redis.del(key_mutex);
//			} else {
//				Thread.sleep(50);//睡眠
//				get(key)//重试
//			}
//		} else {
//			return value;
//		}
//	}
//	}

}
