package top.woilanlan.holding;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * TreeSet 将元素存储在红-黑树数据结构中，实现对结果排序
 */
public class SortedSetOfInteger {
    public static void show(){
        Random rand = new Random(47);
        SortedSet<Integer> intset = new TreeSet<Integer>();
        for(int i = 0; i < 10000; i++)
            intset.add(rand.nextInt(30));
        System.out.println(intset);
    }
}
