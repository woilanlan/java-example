package top.woilanlan.array;

import java.util.Arrays;

/**
 * ArrayInit
 */
public class ArrayInit {

    public static void show() {
        //使用花括号括起来的列表来初始化对象数组。
        Integer[] a = {
            Integer.valueOf(1),
            Integer.valueOf(2),
            3,
        };
        
        Integer[] b = new Integer[]{
            Integer.valueOf(1),
            Integer.valueOf(2),
            3,
        };

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}