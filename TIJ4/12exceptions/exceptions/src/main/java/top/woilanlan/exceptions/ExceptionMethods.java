package top.woilanlan.exceptions;
import static top.woilanlan.util.Print.*;

/**
 * 使用 Exception 类的方法
 */
public class ExceptionMethods {
    public static void show() {
        try {
            throw new Exception("My Exception");
        } catch(Exception e) {
            print("Caught Exception");
            print("getMessage():" + e.getMessage());
            print("getLocalizedMessage():" +
                    e.getLocalizedMessage());
            print("toString():" + e);
            print("printStackTrace():");
            e.printStackTrace(System.out);
        }
    }
}
