package top.woilanlan.exceptions;

import static top.woilanlan.util.Print.*;

class FourException extends Exception {
}

/**
 * finally 总是被执行
 */
public class AlwaysFinally {
    public static void show() {
        print("Entering first try block");
        try {
            print("Entering second try block");
            try {
                throw new FourException();
            } finally {
                print("finally in 2nd try block");
            }
        } catch (FourException e) {
            System.out.println(
                    "Caught FourException in 1st try block");
        } finally {
            System.out.println("finally in 1st try block");
        }
    }
}
