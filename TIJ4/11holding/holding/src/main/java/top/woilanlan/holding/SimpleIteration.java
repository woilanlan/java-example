package top.woilanlan.holding;

import top.woilanlan.typeinfo.pets.Pet;
import top.woilanlan.typeinfo.pets.Pets;

import java.util.Iterator;
import java.util.List;

/**
 * 迭代器
 * 遍历并选择序列中的对象，不必知道或关心该序列底层的结构
 * 将遍历序列的操作与序列底层的结构分离
 * 统一了对容器的访问方式
 */
public class SimpleIteration {
    public static void show() {
        List<Pet> pets = Pets.arrayList(12);
        //使用方法 iterator() 要求容器返回一个 Iterator,Iterator 将准备好返回序列的第一个元素
        Iterator<Pet> it = pets.iterator();
        // hasNext() 检查序列中是否还有元素
        while (it.hasNext()) {
            Pet p = it.next();  //获得序列中的下一个元素
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();

        // 更简单的方式, 在可能的情况下
        for (Pet p : pets)
            System.out.print(p.id() + ":" + p + " ");
        System.out.println();

        // 迭代器也可以删除元素
        it = pets.iterator();
        for (int i = 0; i < 6; i++) {
            it.next();
            it.remove();
        }
        System.out.println(pets);
    }
}
