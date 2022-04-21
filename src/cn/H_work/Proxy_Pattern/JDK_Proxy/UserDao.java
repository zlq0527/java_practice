package cn.H_work.Proxy_Pattern.JDK_Proxy;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 09:28 2022/4/21
 * @ Description：
 */
public class UserDao implements IUserDao {

	@Override
	public void save() {
		System.out.println("原方法输出:保存数据");
	}
}
