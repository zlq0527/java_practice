package cn.H_work.Proxy_Pattern.JDK_Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 09:29 2022/4/21
 * @ Description：
 */
public class UserProxyFactory {
	public Object target;

	public UserProxyFactory(Object target) {
		this.target = target;
	}

	public Object getProxyInstance() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("开启事务");
						Object returnValue = method.invoke(target, args);
						System.out.println("提交事务");
						return returnValue;
					}
				});
	}

}
