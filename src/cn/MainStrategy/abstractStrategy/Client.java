package cn.MainStrategy.abstractStrategy;

public class Client {
    public static void main(String[] args) {
        int exec = Calculator.ADD.exec(1, 2);
        System.out.println(exec);
    }
}
