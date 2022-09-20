package cn.LSP.guns;

public class Soldier {
    private abstractGuns guns;

    public void setGuns(abstractGuns guns) {
        this.guns = guns;
    }

    public void fire() {
        System.out.println("他娘的开炮!!!");
        guns.shoot();
    }

}
