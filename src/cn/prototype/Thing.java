package cn.prototype;

import java.util.ArrayList;

public class Thing implements Cloneable{
    private ArrayList<String> arraylist = new ArrayList<String>();
    @Override
    protected Thing clone(){
        Thing thing = null;
        try {
            thing= (Thing) super.clone();
            thing.arraylist=(ArrayList<String>) thing.arraylist.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }

    public void setValue(String value) {
        this.arraylist.add(value);
    }

    public ArrayList<String> getArraylist() {
        return arraylist;
    }
}
