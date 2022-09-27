package cn.templatemethodpattern;

public abstract class HummerModel {
    private  boolean isAlarm = true;

    public abstract void start();

    public abstract void stop();

    public abstract void alarm();

    public abstract void engineAlarm();

    public boolean isAlarm() {
        return this.isAlarm;
    }

    public void run() {
        this.start();
        this.engineAlarm();
        if (isAlarm()) {
            this.alarm();
        }
        this.stop();
    }

}
