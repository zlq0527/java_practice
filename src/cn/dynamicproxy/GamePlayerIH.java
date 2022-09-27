package cn.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class GamePlayerIH {
    Object object = null;
    public GamePlayerIH(Object object) {
        this.object = object;
    }

    public Object getproxyInstance() {
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equalsIgnoreCase("login")) {
                    System.out.println("tmd 有人登录你的账号了！！！");
                }
                return method.invoke(object, args);
            }
        });
    }
}
