package top.woilanlan.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static top.woilanlan.util.Print.print;

public class StartEnd {
    public static String input = "As long as there is injustice, whenever a\n" +
            "Targathian baby cries out, wherever a distress\n" +
            "signal sounds among the stars ... We'll be there.\n" +
            "This fine ship, and this fine crew ...\n" +
            "Never give up! Never surrender!";

    private static class Display {
        private boolean regexPrinted = false;
        private String regex;

        Display(String regex) {
            this.regex = regex;
        }

        void display(String message) {
            if (!regexPrinted) {
                print(regex);
                regexPrinted = true;
            }
            print(message);
        }
    }

    static void examine(String s, String regex) {
        Display d = new Display(regex);
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find())
            d.display("find() '" + m.group() +
                    "' start = " + m.start() + " end = " + m.end());
        // 只要输入的第一部分匹配就会成功
        if (m.lookingAt()) // 不必使用while
            d.display("lookingAt() start = "
                    + m.start() + " end = " + m.end());
        // 只有在整个输入都匹配正则表达式才会成功
        if (m.matches()) // 不必使用while
            d.display("matches() start = "
                    + m.start() + " end = " + m.end());
    }

    public static void show() {
        for (String in : input.split("\n")) {
            print("input : " + in);
            for (String regex : new String[]{"\\w*ere\\w*",
                    "\\w*ever", "T\\w+", "Never.*?!"})
                examine(in, regex);
        }
    }
}
