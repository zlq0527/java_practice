package cn.dynamicproxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AutoProxy implements InvocationHandler {
    private Singer singer;

    public Object getproxy(Singer singer) {
        this.singer = singer;
        Object instance = Proxy.newProxyInstance(singer.getClass().getClassLoader(), singer.getClass().getInterfaces(), this);
        return instance;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置通知");
        Object invoke = method.invoke(singer);
        System.out.println("后置通知");
        return invoke;
    }
}
