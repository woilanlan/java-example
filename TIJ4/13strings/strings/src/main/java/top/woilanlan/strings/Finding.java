package top.woilanlan.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static top.woilanlan.util.Print.*;

public class Finding {
    public static void show() {
        //将字符串划分为单词
        Matcher m = Pattern.compile("\\w+")
                .matcher("Evening is full of the linnet's wings");
        //向前遍历输出字符串
        while (m.find())
            printnb(m.group() + " ");
        print();
        //根据其参数的值，不断重新设定搜索的起始位置
        int i = 0;
        while (m.find(i)) {
            printnb(m.group() + " ");
            i++;
        }
    }
}
