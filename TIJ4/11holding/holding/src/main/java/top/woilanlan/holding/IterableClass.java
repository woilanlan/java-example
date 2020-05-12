package top.woilanlan.holding;

import java.util.Iterator;

/**
 * Iterable接口，该接口包含一个能够产生 Iterator 的 iterator() 方法
 * Iterable接口被 foreach 用来在序列中移动
 */
public class IterableClass implements Iterable<String> {

    protected String[] words = ("And that is how " +
            "we know the Earth to be banana-shaped.").split(" ");

    /**
     *
     * @return 实现了 Iterator<String> 的匿名内部类的实例
     */
    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;
            public boolean hasNext() {
                return index < words.length;
            }
            public String next() { return words[index++]; }
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void show() {
        for(String s : new IterableClass())
            System.out.print(s + " ");
    }
}
