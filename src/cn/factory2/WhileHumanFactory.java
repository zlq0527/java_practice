package cn.factory2;


public class WhileHumanFactory extends abstarctHumanFactory{
    @Override
    public Human createHuman() {
        return new WhileMan();
    }
}
