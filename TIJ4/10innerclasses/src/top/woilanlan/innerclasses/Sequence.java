package top.woilanlan.innerclasses;

interface Selector{
    boolean end();
    Object current();
    void next();
}

/**
 * Sequence 链接到外部类
 * Sequence类只是一个固定大小的Object的数组，以类的形式包装了起来。
 * 可以调用add()在序列末增加新的Object
 * 要获取Sequence中的每一个对象，可以使用Selector接口
 * 这是“迭代器”设计模式的一个例子。
 */
public class Sequence {

    private Object[] items;
    private int next = 0;
    public Sequence(int size){
        items = new Object[size];
    }
    public void add(Object x) {
        if(next < items.length){
            items[next++] = x;
        }
    }

    //注意：3个方法都用到了items，这是一个引用，是Sequence类的一个私有字段
    //内部类可以访问其外围类的方法和字段
    private class SequenceSelector implements Selector{
        private int i = 0;
        @Override
        public boolean end() {
            return i == items.length;
        }
        @Override
        public Object current() {
            return items[i];
        }
        @Override
        public void next() {
            if(i<items.length){
                i++;
            }
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void show() {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();
        while(!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}