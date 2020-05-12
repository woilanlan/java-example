package top.woilanlan.holding;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * 所有集合都使用 foreach
 */
public class ForEachCollections {
    public static void show(){
        Collection<String> cs = new LinkedList<String>();
        Collections.addAll(cs,
                "Take the long way home".split(" "));
        for(String s : cs)
            System.out.print("'" + s + "' ");
    }
}
