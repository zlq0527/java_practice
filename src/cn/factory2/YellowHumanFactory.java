package cn.factory2;


public class YellowHumanFactory extends abstarctHumanFactory{
    @Override
    public Human createHuman() {
        return new YellowMan();
    }
}
