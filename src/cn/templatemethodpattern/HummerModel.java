package cn.templatemethodpattern;

/**
 * 模板方法模式
 */
public abstract class HummerModel {
    private  boolean isAlarm = true;

    public abstract void start();

    public abstract void stop();

    public abstract void alarm();

    public abstract void engineAlarm();

    public boolean isAlarm() {
        return this.isAlarm;
    }

    /**
     * 定义模板方法，调用类中的抽象方法，抽象方法可以延迟到子类实现。
     */
    public void run() {
        this.start();
        this.engineAlarm();
        if (isAlarm()) {
            this.alarm();
        }
        this.stop();
    }

}
