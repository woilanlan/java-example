package top.woilanlan.holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

class ReversibleArrayList<T> extends ArrayList<T> {

    public ReversibleArrayList(Collection<T> c) {
        super(c);
    }

    public Iterable<T> reversed() {
        return new Iterable<T>() {
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int current = size() - 1;

                    public boolean hasNext() {
                        return current > -1;
                    }

                    public T next() {
                        return get(current--);
                    }

                    public void remove() { // Not implemented
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}

/**
 * 适配器方法 在使用 foreach 时使用其他类型的迭代器
 * 在默认的前向迭代器基础上，添加反向迭代器的能力
 * 不能使用覆盖，而是添加了一个能够产生 Iterable 对象的方法
 */
public class AdapterMethodIdiom {
    public static void show() {
        ReversibleArrayList<String> ral =
                new ReversibleArrayList<String>(
                        Arrays.asList("To be or not to be".split(" ")));
        // 通过iterator()获取普通的迭代器
        for (String s : ral)
            System.out.print(s + " ");
        System.out.println();
        // 给它你选择的迭代
        for (String s : ral.reversed())
            System.out.print(s + " ");
    }
}
