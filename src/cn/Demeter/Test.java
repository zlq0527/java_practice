package cn.Demeter;

public class Test {
    static Someone someone = new Someone();

    public static void main(String[] args) {
        someone.call(new Friend());
    }
}
