package cn.singleton;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println(Singleton.getinstance().hashCode());
        Singleton singleton = (Singleton) Singleton.getinstance().clone();
        System.out.println(singleton.hashCode());
        System.out.println(singleton.equals(Singleton.getinstance()));

    }
}
