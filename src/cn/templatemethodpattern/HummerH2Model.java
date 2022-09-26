package cn.templatemethodpattern;

public class HummerH2Model extends HummerModel{
    @Override
    public void start() {
        System.out.println("H2-start");
    }

    @Override
    public void stop() {
        System.out.println("H2-stop");
    }

    @Override
    public void alarm() {
        System.out.println("H2-alarm");
    }

    @Override
    public void engineAlarm() {
        System.out.println("H2 engineAlarm");
    }

    @Override
    public boolean isAlarm() {
        return false;
    }

}
