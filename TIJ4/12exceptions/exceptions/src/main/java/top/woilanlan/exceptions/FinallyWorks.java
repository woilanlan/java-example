package top.woilanlan.exceptions;

class ThreeException extends Exception {
}

/**
 * finally子句总是被执行
 */
public class FinallyWorks {
    static int count = 0;

    public static void show() {
        while (true) {
            try {
                // 后 ++ ,第一次为 0
                if (count++ == 0)
                    throw new ThreeException();
                System.out.println("No exception");
            } catch (ThreeException e) {
                System.out.println("ThreeException");
            } finally {
                System.out.println("In finally clause");
                if (count == 2)
                    break;  //结束循环
            }
        }
    }
}
