package top.woilanlan.enums;

/**
 * EnumOrder 枚举的声明顺序
 */
public class EnumOrder {

    public static void show() {
        for (Spiciness s : Spiciness.values()) {
            System.out.println(s+", ordinal "+s.ordinal());
        }
    }
}