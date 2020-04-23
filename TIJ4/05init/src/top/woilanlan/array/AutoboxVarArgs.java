package top.woilanlan.array;

/**
 * AutoboxVarArgs
 * 可变参数列表和自动包装机制可以和谐共处
 */
public class AutoboxVarArgs {

    public static void f(Integer... args) {
        for (Integer i : args) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void show() {
        f(Integer.valueOf(1),Integer.valueOf(2));
        f(4,5,6,7,8,9);
        f(10,Integer.valueOf(11),12);
    }
}