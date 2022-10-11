package cn.Strategy2;

/**
 * 带枚举的策略模式
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.getStrategy("A");
    }
}
