package top.woilanlan.exceptions;

/**
 * 有计划的访问栈轨迹信息
 * e.getStackTrace() 返回一个由栈轨迹中的元素所构成的数组，
 * 每一个元素表示栈中的一帧
 * 元素0是栈顶元素，是调用序列中的最后一个方法调用
 */
public class WhoCalled {
    static void f() {
        // 生成一个异常去显示这个栈轨迹
        try {
            throw new Exception();
        } catch (Exception e) {
            for(StackTraceElement ste : e.getStackTrace())
                System.out.println(ste.getMethodName());
        }
    }
    static void g() { f(); }
    static void h() { g(); }

    public static void show() {
        f();
        System.out.println("--------------------------------");
        g();
        System.out.println("--------------------------------");
        h();
    }
}
