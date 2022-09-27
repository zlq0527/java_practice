package cn.factory2;


public class BlackHumanFactory extends abstarctHumanFactory{
    @Override
    public Human createHuman() {
        return new BlackMan();
    }
}
