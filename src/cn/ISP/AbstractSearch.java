package cn.ISP;

public abstract class AbstractSearch {
    protected IPettyGirl pettyGirl;

    public AbstractSearch(IPettyGirl pettyGirl) {
        this.pettyGirl = pettyGirl;
    }

    public abstract void show();
}
