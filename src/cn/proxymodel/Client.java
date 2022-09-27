package cn.proxymodel;

public class Client {
    public static void main(String[] args) {
//        iGame gamePlayer = new GamePlayer("a");
//        iGame gamePlayerProxy = new iGamePlayerProxy(gamePlayer);
//        gamePlayerProxy.login("a", "123");
//        gamePlayerProxy.killBoss();
//        gamePlayerProxy.update();

        iGame gameplayproxy = new iGamePlayerProxy2("abc");
        gameplayproxy.login("abc","123");
        gameplayproxy.killBoss();
        gameplayproxy.update();
    }
}
