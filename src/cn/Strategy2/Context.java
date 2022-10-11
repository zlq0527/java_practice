package cn.Strategy2;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private Map<String, IStrategy> map = new HashMap<>();
    public void getStrategy(String name) {
        map.get(Enum.getiStrategy(name)).operate();
    }
}
