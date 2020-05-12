package top.woilanlan.holding;

import top.woilanlan.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

public class UniqueWordsAlphabetic {
    public static void show() {
        //按照字母进行排序
        Set<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        words.addAll(new TextFile("SetOperations.java", "\\W+"));
        System.out.println(words);
    }
}
