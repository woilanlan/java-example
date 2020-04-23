package top.woilanlan.array;

/**
 * NewVarArgs 新的方式定义可变参数列表
 */
public class NewVarArgs {

    public static void printArray(Object... args) {
        for (Object obj : args) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void show() {
        printArray(Integer.valueOf(47), Float.valueOf(3.14f), Double.valueOf(11.11d));
        printArray(47, 3.14f, 11.11d);
        printArray("one", "two", "three");
        printArray(new A(), new A(), new A());
        printArray((Object[]) new Integer[] { 1, 2, 3, 4, 5 });
        printArray();
    }
}