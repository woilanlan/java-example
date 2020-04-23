package top.woilanlan.array;

import java.util.Arrays;
import java.util.Random;

/**
 * ArrayClassObj
 */
public class ArrayClassObj {

    public static void show() {
        Random rand = new Random(47);
        Integer[] a = new Integer[rand.nextInt(20)];
        System.out.println("length of a = " + a.length);
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(500);
        }
        System.out.println(Arrays.toString(a));
    }
}