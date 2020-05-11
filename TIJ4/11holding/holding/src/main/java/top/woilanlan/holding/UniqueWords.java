package top.woilanlan.holding;

import top.woilanlan.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

/**
 * 列出 SetOperations.java 文件中所有的单词
 *
 */
public class UniqueWords {
    /**
     * 单元测试提示找不到文件
     * 检查资源目录：resources
     * 配置 Working directory：为Maven项目编译输出的目录
     */
    public static void show(){
        // 打开一个文件,并将其读入一个Set中
        // 正则表达式表示一个或多个字母
        Set<String> words = new TreeSet<String>(
                new TextFile("SetOperations.java", "\\W+"));
        System.out.println(words);
    }
}
