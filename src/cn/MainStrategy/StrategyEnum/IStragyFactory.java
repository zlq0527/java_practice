package cn.MainStrategy.StrategyEnum;

import java.util.HashMap;
import java.util.Map;

public class IStragyFactory {

    enum Factory {
        plana("a", new OrderItemShare()),
        planb("b", new SingleItemShare()),
        planc("c", new MultiItemShare());

        private String name;
        private IStragy iStragy;

        Factory(String name, IStragy iStragy) {
            this.name = name;
            this.iStragy = iStragy;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public IStragy getiStragy() {
            return iStragy;
        }

        public void setiStragy(IStragy iStragy) {
            this.iStragy = iStragy;
        }
    }

    private static final Map<String, IStragy> map = new HashMap<>();
    static {
        map.put(Factory.plana.getName(), Factory.plana.getiStragy());
        map.put(Factory.planb.getName(), Factory.planb.getiStragy());
        map.put(Factory.planc.getName(), Factory.planc.getiStragy());
    }

    public IStragy getIstragy(String type) {
        if (type == null || type.isEmpty()) {
            System.out.println("错误");
        }
        return map.get(type);
    }

}
