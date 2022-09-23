package cn.ISP.ISP2;

import cn.ISP.IPettyGirl;

public class Search extends AbstractSearch{

    public Search(IPettyGirl pettyGirl) {
        super(pettyGirl);
    }

    @Override
    public void show() {
        pettyGirl.GoodTemplate();
    }
}
