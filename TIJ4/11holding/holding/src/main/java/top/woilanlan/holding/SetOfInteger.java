package top.woilanlan.holding;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Set不保存重复的元素，基于对象的值来确定归属性
 * Set中最常被使用的是测试归属性，可以很容易的判断某个对象是否在某个Set中
 * 查找成了Set中最重要的操作
 */
public class SetOfInteger {
    /**
     * 在0到29之间的10000个随机数被添加到了Set中，每一个数都重复了许多次
     * 每一个数只有一个实例出现在结果中
     * HashSet使用的是散列函数
     */
    public static void show(){
        Random rand = new Random(47);
        Set<Integer> intset = new HashSet<Integer>();
        for(int i = 0; i < 10000; i++)
            intset.add(rand.nextInt(30));
        System.out.println(intset);
    }
}
