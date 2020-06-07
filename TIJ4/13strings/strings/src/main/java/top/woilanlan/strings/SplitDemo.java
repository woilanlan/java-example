package top.woilanlan.strings;

import java.util.Arrays;
import java.util.regex.Pattern;

import static top.woilanlan.util.Print.print;

public class SplitDemo {
    public static void show() {
        String input =
                "This!!unusual use!!of exclamation!!points";
        print(Arrays.toString(
                Pattern.compile("!!").split(input)));
        // 限制将输入分割成字符串的数量
        print(Arrays.toString(
                Pattern.compile("!!").split(input, 3)));
    }
}
