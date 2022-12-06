package cn.Stream;

import java.util.HashMap;
import java.util.Map;

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry{
    private Map<String, Object> beanMap = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return beanMap.get(beanName);
    }

    protected void addBean(String beanName, Object bean) {
        beanMap.put(beanName, bean);
    }
}
