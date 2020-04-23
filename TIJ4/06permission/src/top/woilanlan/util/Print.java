package top.woilanlan.util;

import java.io.PrintStream;

/**
 * Print
 */
public class Print {

    public Print() {
    }

    // print  with a newline
    // 用换行打印
    public static void print(Object obj) {
        System.out.println(obj);
    }

    // print  a newline by itself
    // 单独打印换行
    public static void print() {
        System.out.println();
    }

    // print  with no line break
    // 打印时不需要换行
    public static void printnb(Object obj) {
        System.out.print(obj);
    }

    // 格式化打印
    public static PrintStream printf(String format,Object... args) {
		return System.out.printf(format,args);
    }

}