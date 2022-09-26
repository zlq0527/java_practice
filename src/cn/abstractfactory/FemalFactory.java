package cn.abstractfactory;

public class FemalFactory implements HumanFactory{
    @Override
    public Human createyellowHuman() {
        return new femaleyellowHuman();
    }

    @Override
    public Human createwhiteHuman() {
        return null;
    }

    @Override
    public Human createBlackHuman() {
        return null;
    }
}
