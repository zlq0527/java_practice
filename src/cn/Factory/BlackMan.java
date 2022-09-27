package cn.Factory;

public class BlackMan implements Human{
    @Override
    public void getcolor() {
        System.out.println("black");
    }

    @Override
    public void talk() {
        System.out.println("老黑说话你听不懂!!");
    }
}
