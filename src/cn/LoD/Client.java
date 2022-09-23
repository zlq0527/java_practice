package cn.LoD;

import java.util.ArrayList;
import java.util.List;

/**
 * 迪米特法则(对象间最少依赖原则)
 */
public class Client {
    public static void main(String[] args) {
        List<Grils> list = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            list.add(new Grils());
        }
        Teacher teacher = new Teacher();
        teacher.command(new GroupLeader(list));
    }
}
