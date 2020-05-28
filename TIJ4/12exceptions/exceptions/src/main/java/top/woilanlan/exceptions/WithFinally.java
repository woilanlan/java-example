package top.woilanlan.exceptions;

/**
 * finally 保证清理
 */
public class WithFinally {
    static Switch sw = new Switch();

    public static void show() {
        try {
            sw.on();
            // 可以抛出异常的代码
            OnOffSwitch.f();
        } catch (OnOffException1 e) {
            System.out.println("OnOffException1");
        } catch (OnOffException2 e) {
            System.out.println("OnOffException2");
        } finally {
            sw.off();
        }
    }
}
