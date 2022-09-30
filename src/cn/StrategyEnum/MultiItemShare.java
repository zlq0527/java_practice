package cn.StrategyEnum;

public class MultiItemShare implements IStragy {
    @Override
    public void doSomeThing(String name) {
        System.out.println(name + "MultiItemShare");
    }
}
