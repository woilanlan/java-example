package top.woilanlan.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReFlags {
    public static void show() {
        // Pattern.CASE_INSENSITIVE 允许模式匹配不考虑大小写
        // Pattern.MULTILINE 在多行模式下，表达式 ^ 和 $ 分别匹配一行开始和结束
        Pattern p = Pattern.compile("^java",
                Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
        Matcher m = p.matcher(
                "java has regex\nJava has regex\n" +
                        "JAVA has pretty good regular expressions\n" +
                        "Regular expressions are in Java");
        while (m.find())
            System.out.println(m.group());
    }
}
