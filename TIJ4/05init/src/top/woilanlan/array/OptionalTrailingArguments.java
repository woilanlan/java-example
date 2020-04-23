package top.woilanlan.array;

/**
 * OptionalTrailingArguments 可选的尾随参数
 */
public class OptionalTrailingArguments {

    public static void f(int required, String... trailing) {
        System.out.println("required = " + required);
        for (String s : trailing) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void show() {
        f(1, "one");
        f(2, "two", "three");
        f(0);
    }
}