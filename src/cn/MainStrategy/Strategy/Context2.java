package cn.MainStrategy.Strategy;

import java.util.HashMap;
import java.util.Map;

public class Context2 {
    public static final Map<String, IStrategy> map = new HashMap<>();

    static {
        map.put("1", new Method1());
        map.put("2", new Method2());
    }

    public void operate(String type) {
        IStrategy strategy = map.get(type);
        strategy.operate();
    }
}
