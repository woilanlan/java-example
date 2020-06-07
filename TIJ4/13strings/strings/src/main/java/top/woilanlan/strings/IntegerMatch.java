package top.woilanlan.strings;

/**
 * 正则表达式
 */
public class IntegerMatch {
    public static void show() {
        // ? 表示可能含有, \d 表示以为数字
        // + 一个或多个之前的表达式
        //可能有一个负号，后面跟着一位或多位数字
        System.out.println("-1234".matches("-?\\d+"));
        System.out.println("5678".matches("-?\\d+"));
        //开头有一个 + ，是一个合法的整数，但与对应的正则表达式不匹配
        System.out.println("+911".matches("-?\\d+"));

        // 括号有将表达式分组的效果，竖线 | 表示或操作
        // 字符 + 在正则表达式中有特殊的意义，所以要使用 \\ 将其转义
        System.out.println("+911".matches("(-|\\+)?\\d+"));
    }
}
