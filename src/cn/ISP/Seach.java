package cn.ISP;

public class Seach extends AbstractSearch{
    public Seach(IPettyGirl pettyGirl) {
        super(pettyGirl);
    }

    @Override
    public void show() {
        pettyGirl.Goodlook();
        pettyGirl.Goodnameface();
        pettyGirl.GoodTemplate();
    }
}
