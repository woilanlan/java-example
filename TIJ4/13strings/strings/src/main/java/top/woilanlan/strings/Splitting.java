package top.woilanlan.strings;

import java.util.Arrays;

public class Splitting {
    public static String knights =
            "Then, when you have found the shrubbery, you must " +
                    "cut down the mightiest tree in the forest... " +
                    "with... a herring!";

    public static void split(String regex) {
        System.out.println(
                Arrays.toString(knights.split(regex)));
    }

    public static void show() {
        split(" "); // 按空格来划分字符串
        // \W 表示非单词字符，\w 表示一个单词字符
        split("\\W+");
        split("n\\W+"); // 字符 'n' 后面跟着一个或多个非单词字符
    }
}
