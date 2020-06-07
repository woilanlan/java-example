package top.woilanlan.strings;

import top.woilanlan.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static top.woilanlan.util.Print.print;

/*! Here's a block of text to use as input to
    the regular expression matcher. Note that we'll
    first extract the block of text by looking for
    the special delimiters, then process the
    extracted block. !*/

public class TheReplacements {

    public static void show() throws Exception {
        String path = TheReplacements.class.getResource("/").getPath();
        String s = TextFile.read(path+"TheReplacements.java");
        // 匹配在 /*! 和 !*/ 之间的所有文字（注意分组括号）
        Matcher mInput = Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL)
                        .matcher(s);
        if (mInput.find())
            s = mInput.group(1); // 捕获通过占位符
        // 将存在两个或两个以上空格的地方，缩减为一个空格
        s = s.replaceAll(" {2,}", " ");
        //删除每行开头部分的所有空格，使用模式 MULTILINE
        s = s.replaceAll("(?m)^ +", "");
        print(s);
        s = s.replaceFirst("[aeiou]", "(VOWEL1)");
        StringBuffer sbuf = new StringBuffer();
        Pattern p = Pattern.compile("[aeiou]");
        Matcher m = p.matcher(s);
        // 想对这些替换字符串执行某些特殊处理
        while (m.find())
            m.appendReplacement(sbuf, m.group().toUpperCase());
        // 将处理的结果存入 subf
        m.appendTail(sbuf);
        print(sbuf);
    }
}
