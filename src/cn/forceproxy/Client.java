package cn.forceproxy;

public class Client {
    public static void main(String[] args) {
        iGamePlayer gamePlayer = new GamePlayer("ac");
        iGamePlayer getproxy = gamePlayer.getproxy();
        getproxy.killBoss();
        getproxy.update();
    }
}
