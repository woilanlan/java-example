package top.woilanlan.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * 打印对象的内存地址
 */
public class InfiniteRecursion {
    public String toString() {
        // 发生递归调用，异常，
        // 所以不能用 this ,应调用 Object.toString() 方法
        // return " InfiniteRecursion address: " + this + "\n";
        return " InfiniteRecursion address: " + super.toString() + "\n";
    }
    public static void show() {
        List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
        for(int i = 0; i < 10; i++)
            v.add(new InfiniteRecursion());
        System.out.println(v);
    }
}
