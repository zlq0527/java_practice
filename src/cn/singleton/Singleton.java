package cn.singleton;

public class Singleton implements Cloneable {
    private static final Singleton singleton = new Singleton();
    private int count;
    /**
     *     私有化构造方法,防止外界用new创建对象.
     */
    private Singleton() {
    }

    public static Singleton getinstance() {
        return singleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
