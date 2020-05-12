package top.woilanlan.exceptions;

class MyException extends Exception {
    public MyException() {
    }

    public MyException(String msg) {
        super(msg);
    }
}

/**
 * 为异常类定义一个接受字符串参数的构造器
 * e.printStackTrace(); 默认信息输出到标准错误流
 */
public class FullConstructors {
    public static void f() throws MyException {
        System.out.println("Throwing MyException from f()");
        throw new MyException();
    }

    public static void g() throws MyException {
        System.out.println("Throwing MyException from g()");
        throw new MyException("Originated in g()");
    }

    public static void show() {
        try {
            f();
        } catch (MyException e) {
            // 调用 Throwable 类声明的 printStackTrace() 方法
            // 打印 从方法调用处直到异常抛出处 的方法调用序列
            // 信息被发送到 System.out 自动的被捕获显示在输出中
            e.printStackTrace(System.out);
        }
        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
    }
}
