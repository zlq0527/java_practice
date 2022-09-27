package cn.dynamicproxy2;

public class Client {
    public static void main(String[] args) {
        Star star = (Star) new AutoProxy().getproxy(new Singer());
        star.show();
    }
}
