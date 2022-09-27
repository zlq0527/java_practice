package cn.abstractfactory2;

public abstract class Phone {
    public void productCPU() {
        System.out.println("CPU是台积电代工");
    }
    public abstract void productScreen();
}
