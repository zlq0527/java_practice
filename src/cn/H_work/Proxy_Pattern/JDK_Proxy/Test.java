package cn.H_work.Proxy_Pattern.JDK_Proxy;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 09:33 2022/4/21
 * @ Description：
 */
public class Test {
	public static void main(String[] args) {
		IUserDao userDao = new UserDao();
		System.out.println(userDao.getClass());
		IUserDao proxy = (IUserDao) new UserProxyFactory(userDao).getProxyInstance();
		System.out.println(proxy.getClass());  //输出代理对象信息
		proxy.save();  //执行代理方法
	}
}
