package cn.LSP.guns;

public class Aug_guns extends Rifle{
    public void zoomOut() {
        System.out.println("瞄准");
    }
    @Override
    public void shoot() {
        System.out.println("AUG射击");
    }
}
