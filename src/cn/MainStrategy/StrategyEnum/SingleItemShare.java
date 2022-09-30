package cn.MainStrategy.StrategyEnum;

public class SingleItemShare implements IStragy {
    @Override
    public void doSomeThing(String name) {
        System.out.println(name + "SingleItemShare");
    }
}
