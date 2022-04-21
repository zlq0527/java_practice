package cn.H_work.Proxy_Pattern.staticproxy;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 09:17 2022/4/21
 * @ Description：
 */
public class Test {
	public static void main(String[] args) {
		IUserDao userDao = new UserDao();
		UserDaoProxy userDapProxy = new UserDaoProxy(userDao);
		userDapProxy.save();

	}
}
