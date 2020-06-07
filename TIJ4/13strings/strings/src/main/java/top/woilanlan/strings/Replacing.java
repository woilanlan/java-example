package top.woilanlan.strings;

import static top.woilanlan.util.Print.*;

public class Replacing {
    static String s = Splitting.knights;

    public static void show() {
        print(s.replaceFirst("f\\w+", "located"));
        print(s.replaceAll("shrubbery|tree|herring", "banana"));
    }
}
