package cn.prototype;

public class Client {
    public static void main(String[] args) {
        Thing thing = new Thing();
        thing.setValue("zs");
        Thing clonething = thing.clone();
        clonething.setValue("ls");
    }
}
