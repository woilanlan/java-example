package top.woilanlan.holding;

import top.woilanlan.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

public class UniqueWordsAlphabetic {

    public static void show() {
        //按照字母进行排序
        Set<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        //获取resource的文件路径
        String path = UniqueWordsAlphabetic.class.getResource("/").getPath();
        words.addAll(new TextFile(path+"SetOperations.java", "\\W+"));
        System.out.println(words);
    }
}
