package top.woilanlan.interfaces;

import java.util.Random;

/**
 * RandVals
 * 接口中的域自动是 static 和 final
 */
public interface RandVals {

    Random RAND = new Random(47);
    int RAND_INT = RAND.nextInt(10);
    long RAND_LONG = RAND.nextLong()*10;
    float RAND_FLOAT = RAND.nextFloat()*10;
    double RAND_DOUBLE = RAND.nextDouble()*10;
}