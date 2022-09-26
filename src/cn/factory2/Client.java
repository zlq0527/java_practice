package cn.factory2;

public class Client {
    public static void main(String[] args) {
        Human human = (new BlackHumanFactory()).createHuman();
        human.getcolor();
        human.talk();
    }
}
