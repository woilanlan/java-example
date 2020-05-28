package top.woilanlan.exceptions;

/**
 * 即使抛出了异常，也不会产生任何输出
 */
public class ExceptionSilencer {
    public static void show() {
        try {
            throw new RuntimeException();
        } finally {
            // 在 finally 块中使用 return ,将使任何抛出的异常静默
            return;
        }
    }
}
