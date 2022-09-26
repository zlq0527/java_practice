package cn.dynamicproxy;

public class Client {
    public static void main(String[] args) {
        GamePlayer gamePlayer = new GamePlayer("zs");
        iGame gameplayer = ((iGame) new AutoProxy().getproxy(gamePlayer));
        gameplayer.login("zs","123456");
        gameplayer.killBoss();
        gameplayer.update();

    }
}
