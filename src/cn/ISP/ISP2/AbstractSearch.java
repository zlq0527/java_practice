package cn.ISP.ISP2;

import cn.ISP.IPettyGirl;

/**
 * @author zhaolengquan
 */
public abstract class AbstractSearch {
    protected IPettyGirl pettyGirl;

    public AbstractSearch(IPettyGirl pettyGirl) {
        this.pettyGirl = pettyGirl;
    }

    public abstract void show();
}
