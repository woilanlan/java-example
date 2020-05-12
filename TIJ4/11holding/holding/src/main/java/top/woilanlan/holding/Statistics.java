package top.woilanlan.holding;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * HashMap的简单演示
 * Statistics 统计
 * 检查 Java 的 Random 类的随机性
 * 即生成大量的随机数，并对落入各种不同范围的数字进行计数
 */
public class Statistics {
    public static void show() {
        Random rand = new Random(47);
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < 10000; i++) {
            // 产生一个0到20之间的数字
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(m);
    }
}
