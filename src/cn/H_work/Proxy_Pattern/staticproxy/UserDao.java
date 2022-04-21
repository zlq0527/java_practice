package cn.H_work.Proxy_Pattern.staticproxy;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 09:08 2022/4/21
 * @ Description：
 */
public class UserDao implements IUserDao{
	@Override
	public void save() {
		System.out.println("原方法输出保存数据");
	}
}
