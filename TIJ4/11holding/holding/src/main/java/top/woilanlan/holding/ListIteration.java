package top.woilanlan.holding;

import top.woilanlan.typeinfo.pets.Pet;
import top.woilanlan.typeinfo.pets.Pets;

import java.util.List;
import java.util.ListIterator;

/**
 * ListIterator 是一个更加强大的 Iterator 的子类型
 * 它只能用于各种 List 类的访问
 */
public class ListIteration {
    public static void show() {
        List<Pet> pets = Pets.arrayList(8);
        ListIterator<Pet> it = pets.listIterator();
        while (it.hasNext())
            System.out.print(it.next() + ", " + it.nextIndex() +
                    ", " + it.previousIndex() + "; ");
        System.out.println();

        // 反向
        while (it.hasPrevious())
            System.out.print(it.previous().id() + " ");
        System.out.println();
        System.out.println(pets);
        it = pets.listIterator(3);
        while (it.hasNext()) {
            it.next();
            it.set(Pets.randomPet());
        }
        System.out.println(pets);
    }
}
