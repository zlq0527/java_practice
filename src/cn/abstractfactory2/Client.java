package cn.abstractfactory2;

public class Client {
    public static void main(String[] args) {
        abstractFactoryCreate phone1 = new Create1();
        Factory1 p1 = phone1.phone1();
        p1.productScreen();
        p1.productCPU();
    }
}
