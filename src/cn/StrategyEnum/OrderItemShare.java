package cn.StrategyEnum;

public class OrderItemShare implements IStragy {
    @Override
    public void doSomeThing(String name) {
        System.out.println(name + "OrderItemShare");
    }
}
