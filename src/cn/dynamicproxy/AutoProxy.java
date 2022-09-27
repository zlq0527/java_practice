package cn.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AutoProxy implements InvocationHandler {
    private GamePlayer gamePlayer;
    public Object getproxy(GamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
        return Proxy.newProxyInstance(GamePlayer.class.getClassLoader(), GamePlayer.class.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(gamePlayer,args);
    }

}
