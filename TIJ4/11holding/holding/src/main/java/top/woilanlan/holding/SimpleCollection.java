package top.woilanlan.holding;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollection {
    public static void show(){
        Collection<Integer> c = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }
        for (Integer i : c) {
            System.out.print(i+",");
        }
    }
}
