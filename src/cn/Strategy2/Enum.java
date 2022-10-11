package cn.Strategy2;

public enum Enum {
    /**
     * 方法1
     */
    A("m1","Method1"),

    /**
     * 方法2
     */
    B("m2","Method2");

    private final String key;

    private final String iStrategy;

    public static String getiStrategy(String name) {
        if (name == null) {
            return A.getiStrategy();
        }
        for (Enum value : Enum.values()) {
            if (value.getKey().equalsIgnoreCase(name)) {
                return value.getiStrategy();
            }
        }
        return null;
    }

    Enum(String key, String iStrategy) {
        this.key = key;
        this.iStrategy = iStrategy;
    }

    public String getKey() {
        return key;
    }

    public String getiStrategy() {
        return iStrategy;
    }
}
