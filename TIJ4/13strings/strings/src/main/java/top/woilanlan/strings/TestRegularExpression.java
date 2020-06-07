package top.woilanlan.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static top.woilanlan.util.Print.print;

public class TestRegularExpression {

    /**
     * debug调试走一遍
     * @param args
     * new String[]{"abcabcabcdefabc","abc+","(abc)+","(abc){2,}"}
     */
    public static void show(String[] args) {
        if (args.length < 2) {
            print("Usage:\njava TestRegularExpression " +
                    "characterSequence regularExpression+");
            System.exit(0);
        }
        print("Input: \"" + args[0] + "\"");
        for (String arg : args) {
            print("Regular expression: \"" + arg + "\"");
            Pattern p = Pattern.compile(arg);   //编译后的正则表达式
            Matcher m = p.matcher(args[0]);
            while (m.find()) {
                print("Match \"" + m.group() + "\" at positions " +
                        m.start() + "-" + (m.end() - 1));
            }
        }
    }
}
