package cn.forceproxy;

public class GamePlayerProxy implements iGamePlayer{
    private iGamePlayer gamePlayer=null;

    public GamePlayerProxy(iGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String username, String password) {
        this.gamePlayer.login(username,password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void update() {
        this.gamePlayer.update();
    }

    @Override
    public iGamePlayer getproxy() {
        return this;
    }
}
