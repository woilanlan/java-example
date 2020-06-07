package top.woilanlan.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Resetting {
    public static void show() throws Exception {
        Matcher m = Pattern.compile("[frb][aiu][gx]")
                .matcher("fix the rug with bags");
        while (m.find())
            System.out.print(m.group() + " ");
        System.out.println();
        // 将 Matcher 对象重新设置到当前字符序列的起始位置
        m.reset("fix the rig with rags");
        while (m.find())
            System.out.print(m.group() + " ");
    }
}
