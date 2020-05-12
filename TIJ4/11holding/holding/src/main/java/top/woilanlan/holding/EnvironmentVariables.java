package top.woilanlan.holding;

import java.util.Map;

/**
 * 显示所有的操作系统环境变量
 */
public class EnvironmentVariables {
    public static void show() {

        // System.getenv() 返回一个Map
        // entrySet() 产生一个由 Map.Entry 的元素构成的 Set
        for (Map.Entry entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ": " +
                    entry.getValue());
        }
    }
}
