package top.woilanlan.holding;

import java.util.*;

public class MultiIterableClass extends IterableClass {

    public Iterable<String> reversed() {
        return new Iterable<String>() {
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    int current = words.length - 1;
                    public boolean hasNext() { return current > -1; }
                    public String next() { return words[current--]; }
                    public void remove() { // Not implemented
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }


    public Iterable<String> randomized() {
        return new Iterable<String>() {

            // 直接返回被打乱的 List 中的 iterator
            public Iterator<String> iterator() {
                //用 ArrayList 将 Arrays.asList() 方法的结果进行了包装，产生了新对象
                List<String> shuffled =
                        new ArrayList<String>(Arrays.asList(words));
                // 没有影响到原来的数组，只是打乱了 shuffled 中的引用
                Collections.shuffle(shuffled, new Random(47));
                return shuffled.iterator();
            }
        };
    }

    public static void show() {
        MultiIterableClass mic = new MultiIterableClass();
        for(String s : mic.reversed())
            System.out.print(s + " ");
        System.out.println();
        for(String s : mic.randomized())
            System.out.print(s + " ");
        System.out.println();
        for(String s : mic)
            System.out.print(s + " ");
    }
}
