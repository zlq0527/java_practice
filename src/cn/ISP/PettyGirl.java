package cn.ISP;

public class PettyGirl implements IPettyGirl{
    private String name;

    public PettyGirl(String name) {
        this.name = name;
    }

    @Override
    public void Goodlook() {
        System.out.println(name+"goodlook");
    }

    @Override
    public void Goodnameface() {
        System.out.println(name+"GoodFace");
    }

    @Override
    public void GoodTemplate() {
        System.out.println(name+"Goodtemplate");
    }
}
