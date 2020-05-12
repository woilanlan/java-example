package top.woilanlan.holding;

import top.woilanlan.typeinfo.pets.Pet;
import top.woilanlan.typeinfo.pets.Pets;

import java.util.Iterator;

class PetSequence {
    protected Pet[] pets = Pets.createArray(8);
}

/**
 * 生成 iterator 是将队列与消费队列的方法连接在一起耦合度最小的方式
 * 与实现 Collection 相比，它在序列类所施加的约束也少的多。
 */
public class NonCollectionSequence extends PetSequence {
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;
            public boolean hasNext() {
                return index < pets.length;
            }
            public Pet next() { return pets[index++]; }
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }
    public static void show(){
        NonCollectionSequence nc = new NonCollectionSequence();
        InterfaceVsIterator.display(nc.iterator());
    }
}
