package top.woilanlan.exceptions;

/**
 * 为什么要用 finally 子句
 * 把内存之外的资源恢复到它们的初始状态时，
 * 如已经打开的文件或网络连接，在屏幕上画的图形
 */
public class OnOffSwitch {

    private static Switch sw = new Switch();

    public static void f()
            throws OnOffException1, OnOffException2 {
    }

    public static void show() {
        try {
            sw.on();
            // 可以抛出异常的代码
            f();
            sw.off();
        } catch (OnOffException1 e) {
            System.out.println("OnOffException1");
            sw.off();
        } catch (OnOffException2 e) {
            System.out.println("OnOffException2");
            sw.off();
        }
    }
}
