package cn.ISP;

public class Client {
    public static void main(String[] args) {
        IPettyGirl pettyGirl = new PettyGirl("如花");
        AbstractSearch Gouzai = new Seach(pettyGirl);
        Gouzai.show();
    }
}
