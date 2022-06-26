package cn.Demeter;

public class Friend {
    private Strangers stranger = new Strangers();

    public void call() {
        stranger.strangerMethod();
    }

    public void friendmethod() {
        System.out.println("朋友的方法");
    }
    //feedinfo新增的代码
}
