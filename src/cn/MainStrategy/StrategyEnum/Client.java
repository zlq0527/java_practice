package cn.MainStrategy.StrategyEnum;

public class Client {
    public static void main(String[] args) {
        IStragyFactory factory = new IStragyFactory();
        IStragy a = factory.getIstragy("a");
        a.doSomeThing("a");
    }
}
