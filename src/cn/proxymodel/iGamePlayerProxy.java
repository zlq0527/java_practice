package cn.proxymodel;

public class iGamePlayerProxy implements iGame {
    private iGame gamePlayer = null;

    public iGamePlayerProxy(iGame gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String username, String password) {
        this.gamePlayer.login(username, password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void update() {
        this.gamePlayer.update();
    }
}
