package cn.forceproxy;

public class GamePlayer implements iGamePlayer {

    String name = "";
    private iGamePlayer proxy = null;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String username, String password) {
        if (this.isProxy()) {
            System.out.println(username + "login");
        } else {
            System.out.println("未使用代理访问");
        }
    }

    @Override
    public void killBoss() {
        if (this.isProxy()) {
            System.out.println(this.name + "killboss");
        } else {
            System.out.println("未使用代理访问");
        }
    }

    @Override
    public void update() {
        if (this.isProxy()) {
            System.out.println(this.name + "update!!!");
        } else {
            System.out.println("未使用代理访问");
        }
    }

    private boolean isProxy() {
        if (this.proxy == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public iGamePlayer getproxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }
}
