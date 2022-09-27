package cn.Factory;

public class Client {
    public static void main(String[] args) {
        HumanFactory humanFactory = new HumanFactory();
        Human human = humanFactory.createHuman(BlackMan.class);
        human.getcolor();
        human.talk();
    }
}
