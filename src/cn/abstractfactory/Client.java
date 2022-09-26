package cn.abstractfactory;

public class Client {
    public static void main(String[] args) {
        HumanFactory humanFactory = new FemalFactory();
        Human human = humanFactory.createyellowHuman();
        human.getcolor();
        human.getsex();
        human.talk();
    }
}
