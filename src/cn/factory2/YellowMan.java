package cn.factory2;


public class YellowMan implements Human {
    @Override
    public void getcolor() {
        System.out.println("yellow");
    }

    @Override
    public void talk() {
        System.out.println("黄人说话双音节");
    }
}
