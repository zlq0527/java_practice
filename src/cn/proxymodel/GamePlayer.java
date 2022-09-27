package cn.proxymodel;

public class GamePlayer implements iGame {

    private String username;

    public GamePlayer(iGame game,String username) throws Exception {
        if (game == null) {
            throw new Exception("不能创建真实对象");
        } else {
            this.username = username;
        }
    }

    @Override
    public void login(String username, String password) {
        System.out.println(username+"login");
    }

    @Override
    public void killBoss() {
        System.out.println(username+"killboss");
    }

    @Override
    public void update() {
        System.out.println(username + "update");
    }
}
