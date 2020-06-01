package top.woilanlan.strings;

import static top.woilanlan.util.Print.*;

/**
 * String 对象是不可变的
 * 每当把 String 对象作为方法的参数时，都会复制一份引用，
 * 而该引用所指的对象其实一直待在单一物理位置上，从未改变。
 *
 * 对一个方法而言，参数是为该方法提供信息的，而不是想让该方法改变自己的。
 */
public class Immutable {

    public static String upcase(String s) {
        // 创建了一个全新的 String 对象，以包含修改后的字符串内容
        return s.toUpperCase(); //返回最终结果的引用
    }

    public static void show() {
        String q = "howdy";
        print(q); // howdy
        String qq = upcase(q);
        print(qq); // HOWDY
        print(q); // howdy
    }
}
