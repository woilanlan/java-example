package top.woilanlan.strings;

import java.util.Scanner;

/**
 * 默认情况下，Scanner根据空白字符对输入进行分词，
 * 但是可以用正则表达式指定自己所需的定界符
 */
public class ScannerDelimiter {
    public static void show() {
        Scanner scanner = new Scanner("12, 42, 78, 99, 42");
        scanner.useDelimiter("\\s*,\\s*");  //使用逗号(包括前后任意的空白字符)作为定界符
        while(scanner.hasNextInt())
            System.out.println(scanner.nextInt());
    }
}
