package cn.MainStrategy.Strategy;

/**
 * 策略模式的容器，用于封装角色
 */
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void getStrategy() {
        this.strategy.operate();
    }
}
