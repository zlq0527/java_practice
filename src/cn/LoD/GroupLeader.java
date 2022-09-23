package cn.LoD;

import java.util.List;

public class GroupLeader {
    private List<Grils> grils;

    public GroupLeader(List<Grils> grils) {
        this.grils = grils;
    }

    public void countNumbers() {
        System.out.println("女生的数量是" + grils.size());
    }
}
