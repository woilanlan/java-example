package top.woilanlan.holding;

import top.woilanlan.typeinfo.pets.Pet;
import top.woilanlan.typeinfo.pets.Pets;

import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * 通过继承一个持有Pet对象的类来创建一个 Collection 的实现
 * 如果实现 Collection 就必须实现 iterator()
 * 如果你的类已经继承了其他类，就不能继承 AbstractCollection，
 * 这时就必须实现该接口中的所有方法
 */
public class CollectionSequence
        extends AbstractCollection<Pet> {

    private Pet[] pets = Pets.createArray(8);

    public int size() {
        return pets.length;
    }

    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            public boolean hasNext() {
                return index < pets.length;
            }

            public Pet next() {
                return pets[index++];
            }

            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void show() {
        CollectionSequence c = new CollectionSequence();
        InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());
    }
}
