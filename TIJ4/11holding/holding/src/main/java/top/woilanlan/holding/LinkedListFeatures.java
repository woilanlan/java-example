package top.woilanlan.holding;

import top.woilanlan.typeinfo.pets.Hamster;
import top.woilanlan.typeinfo.pets.Pet;
import top.woilanlan.typeinfo.pets.Pets;
import top.woilanlan.typeinfo.pets.Rat;

import java.util.LinkedList;

/**
 * LinkedList 实现了基本的List接口，
 * 但在List的中间插入和移除时比 ArrayList 更高效
 *
 * LinkedList 还添加了可以使其用做栈、队列或双端队列的方法
 */
public class LinkedListFeatures {
    public static void show() {
        LinkedList<Pet> pets =
                new LinkedList<Pet>(Pets.arrayList(5));
        System.out.println(pets);

        // 返回此 List 中的第一个元素
        System.out.println("pets.getFirst(): " + pets.getFirst());
        System.out.println("pets.element(): " + pets.element());
        // 检索但不删除此 List 的头(第一个元素)。
        System.out.println("pets.peek(): " + pets.peek());

        // 检索并删除此 List 的头(第一个元素)
        System.out.println("pets.remove(): " + pets.remove());
        System.out.println("pets.removeFirst(): " + pets.removeFirst());
        // 检索并删除此 List 的头(第一个元素)。如果该 List 为空，则为 null
        System.out.println("pets.poll(): " + pets.poll());
        System.out.println(pets);

        pets.addFirst(new Rat());   // 将指定的元素插入此 List 的开头
        System.out.println("After addFirst(): " + pets);
        pets.offer(Pets.randomPet());   // 将指定的元素添加为此列表的末尾(最后一个元素)。
        System.out.println("After offer(): " + pets);
        pets.add(Pets.randomPet());     // 将指定的元素追加到此列表的末尾。
        System.out.println("After add(): " + pets);
        pets.addLast(new Hamster());
        System.out.println("After addLast(): " + pets);
        System.out.println("pets.removeLast(): " + pets.removeLast());
    }
}
