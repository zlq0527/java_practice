package cn.ISP.ISP2;

public class PettyGirl implements IGoodBodyGirl, IGreatTemperamentGirl {
    private String name;

    public PettyGirl(String name) {
        this.name = name;
    }

    @Override
    public void goodFace() {
        System.out.println(name + "facegood");
    }

    @Override
    public void niceFigure() {
        System.out.println(name + "niceFigure");
    }

    @Override
    public void greatTemperament() {
        System.out.println(name + "greateTemperament");
    }
}
