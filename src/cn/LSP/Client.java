package cn.LSP;

import cn.LSP.guns.*;

public class Client {
    public static void main(String[] args) {
        Soldier soldier = new Soldier();
        soldier.setGuns(new MachineGuns());
        soldier.fire();
        System.out.println("--------------");
        Snipper snipper = new Snipper();
        //里氏替换原则 父类可以胜任的地方子类一定可以, 子类又有自己的特性,子类可以胜任的地方父类不一定可以.
        //这里使用aug的父类,new Rifle()当参数就会报错.
        snipper.killEnemy(new Aug_guns());

    }
}
