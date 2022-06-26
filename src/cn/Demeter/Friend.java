package cn.Demeter;

public class Friend {
    private Strangers stranger = new Strangers();

    public void call() {
        stranger.strangerMethod();
    }

    public void friendmethod() {
        System.out.println("朋友的方法");
    }
    //Master分支修改的代码

}
