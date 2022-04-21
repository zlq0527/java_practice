package cn.H_work.Proxy_Pattern.staticproxy;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 09:16 2022/4/21
 * @ Description：
 */
public class UserDaoProxy implements IUserDao{
	private IUserDao userDao;
	@Override
	public void save() {
		System.out.println("代理类输出开启事务");//扩展了额外功能
		userDao.save();
		System.out.println("代理类输出提交事务");
	}

	public UserDaoProxy(IUserDao userDao) {
		this.userDao = userDao;
	}
}
