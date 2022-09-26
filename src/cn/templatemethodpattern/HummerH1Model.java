package cn.templatemethodpattern;

public class HummerH1Model extends HummerModel{
    protected boolean alarmFlag = true;
    @Override
    public void start() {
        System.out.println("H1-start");
    }

    @Override
    public void stop() {
        System.out.println("H1-stop");
    }

    @Override
    public void alarm() {
        System.out.println("H1-alarm");
    }

    @Override
    public void engineAlarm() {
        System.out.println("H1 engineAlarm");
    }

    @Override
    public boolean isAlarm() {
        return this.alarmFlag;
    }

    public void setAlarm(boolean alarm) {
        this.alarmFlag = alarm;
    }
}
