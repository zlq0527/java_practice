package cn.service;

public abstract class BaseService implements Iservice {
    @Override
    public void shot() {
        System.out.println("baseService shot");
    }

    @Override
    public void eat() {
        System.out.println("baseService eat");
    }
}
