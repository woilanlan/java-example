package top.woilanlan.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static top.woilanlan.util.Print.*;

/**
 * 组是用括号划分的正则表达式，可以根据组的编号来引用某个组
 * 组号为0表示整个表达式，组号为1表示被第一对括号括起来的组
 */
public class Groups {
    public static final String POEM =
            "Twas brillig, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";

    public static void show() {
        //捕获每行最后的3个词，每行最后以 $ 结束
        // 模式标记 (?m) 显式地告知正则表达式注意输入序列中的换行符
        Matcher m = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$")
                        .matcher(POEM);
        while (m.find()) {
            for (int j = 0; j <= m.groupCount(); j++)
                //返回在前一次匹配操作期间指定的组号
                print("[" + m.group(j) + "]");
            print();
        }
    }
}
