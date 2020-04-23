package top.woilanlan;

import java.util.Random;

/**
 * MathOps
 */
public class MathOps {

    private Random rand;

    public MathOps(){
        //如果没有传递值，将当前时间作为随机数生成器的种子。
        //提供种子，就可以在每一次程序执行时都生成相同的随机数。
        rand = new Random(47);
    }

    public void show() {
        int i, j, k;
        //设置所产生随机数的上限，下限为0，排除除数为0的情况，所以加1
        j = rand.nextInt(100) + 1;
        System.out.println("j: " + j);
        k = rand.nextInt(100) + 1;
        System.out.println("k: " + k);
        i = j + k;
        System.out.println("j+k = " + i);
        i = j - k;
        System.out.println("j-k = " + i);
        i = j * k;
        System.out.println("j*k = " + i);
        i = j / k;
        System.out.println("j/k = " + i);
        i = j % k;
        System.out.println("j%k = " + i);
        j %= k;
        System.out.println("j %= k " + j);
    }

    public void show2(){
        float u,v,w;
        v = rand.nextFloat();
        System.out.println("v: "+v);
        w = rand.nextFloat();
        System.out.println("w: "+w);
        u = v+w;
        System.out.println("v+w = "+u);
        u = v-w;
        System.out.println("v-w = "+u);
        u = v*w;
        System.out.println("v*w = "+u);
        u = v/w;
        System.out.println("v/w = "+u);
        u += v;
        System.out.println("u += v "+ u);
        u -= v;
        System.out.println("u -= v "+ u);
        u *= v;
        System.out.println("u *= v "+ u);
        u /= v;
        System.out.println("u /= v "+ u);
    }
}