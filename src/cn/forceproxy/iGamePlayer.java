package cn.forceproxy;

public interface iGamePlayer {
    public void login(String username, String password);

    public void killBoss();

    public void update();

    public iGamePlayer getproxy();
}
