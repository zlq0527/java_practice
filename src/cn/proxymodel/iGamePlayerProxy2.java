package cn.proxymodel;

public class iGamePlayerProxy2 implements iGame {
    private iGame gamePlayer = null;

    public iGamePlayerProxy2(String name) {
        try {
            gamePlayer = new GamePlayer(this,name);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
