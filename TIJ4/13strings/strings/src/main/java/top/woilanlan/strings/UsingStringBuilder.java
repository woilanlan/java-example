package top.woilanlan.strings;

import java.util.Random;

public class UsingStringBuilder {

    public static Random rand = new Random(47);

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < 25; i++) {
            result.append(rand.nextInt(100));
            result.append(", ");
        }
        // 删除最后一个逗号与空格
        result.delete(result.length() - 2, result.length());
        result.append("]");
        return result.toString();
    }

    public static void show() {
        UsingStringBuilder usb = new UsingStringBuilder();
        System.out.println(usb);
    }
}
