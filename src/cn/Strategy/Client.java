package cn.Strategy;

/**
 * 策略模式
 */
public class Client {
    public static void main(String[] args) {
        Context method1 = new Context(new Method1());
        method1.getStrategy();

        Context method2 = new Context(new Method2());
        method2.getStrategy();
    }
}
