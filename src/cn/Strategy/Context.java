package cn.Strategy;

public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void getStrategy() {
        this.strategy.operate();
    }
}
