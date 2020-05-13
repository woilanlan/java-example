package top.woilanlan.exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Logger.getLogger() 创建了一个 String 参数相关联的 Logger 对象
 * 调用与日志记录消息的级别相关联的方法：severe()
 * 使用重载的 printStackTrace(java.io.PrintWriter)
 * 调用 PrintWriter(java.io.StringWriter) 构造方法
 * 就可以通过StringWriter 的 toString() 获取到 String 字符串
 */
class LoggingException extends Exception {
    private static Logger logger =
            Logger.getLogger("LoggingException");

    public LoggingException() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

/**
 * 异常与记录日志
 */
public class LoggingExceptions {
    public static void show() {
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Caught " + e);
        }
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Caught " + e);
        }
    }
}
