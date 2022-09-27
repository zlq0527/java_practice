package cn.Factory;

public class HumanFactory extends abstarctHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生产错误!");
        }
        return (T)human;
    }
}
