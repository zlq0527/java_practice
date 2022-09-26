package cn.Factory;

public abstract class abstarctHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
