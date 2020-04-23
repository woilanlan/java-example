package top.woilanlan.interfaces;

import java.util.Random;

/**
 * RandomDoubles 未实现Readable接口
 */
public class RandomDoubles {

    private static Random rand = new Random(47);
    
    public double next() {
        return rand.nextDouble();
    }
    
    public static void show() {
        RandomDoubles rd = new RandomDoubles();
        for (int i = 0; i < 7; i++) {
            System.out.print(rd.next()+" ");
        }
    }
}