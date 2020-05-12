package top.woilanlan.holding;

import java.util.Arrays;

/**
 * foreach 语句可以用于数组或其他 Iterable，
 * 但并不意味着数组肯定也是一个 Iterable
 */
public class ArrayIsNotIterable {

    static <T> void test(Iterable<T> ib) {
        for (T t : ib)
            System.out.print(t + " ");
    }

    public static void show() {
        test(Arrays.asList(1, 2, 3));
        String[] strings = {"A", "B", "C"};
        // 数组可以使用 foreach ，但它不是 Iterable
        //! test(strings);
        // 必须显式地将其转换为 Iterable
        test(Arrays.asList(strings));
    }
}
