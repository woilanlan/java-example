package top.woilanlan.exceptions;

/**
 * 如果 RuntimeException 没有被捕获，而直达 main()
 * 那么在程序退出前将调用异常的 printStackTrace() 方法
 * 输出到 System.err
 */
public class NeverCaught {
    static void f() {
        throw new RuntimeException("From f()");
    }

    static void g() {
        f();
    }

    public static void show() {
        g();
    }
}
