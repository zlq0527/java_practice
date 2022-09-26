package cn.abstractfactory;


public abstract class WhileMan implements Human {

    @Override
    public void getcolor() {
        System.out.println("While");
    }

    @Override
    public void talk() {
        System.out.println("白人说话单音节!");
    }
}
