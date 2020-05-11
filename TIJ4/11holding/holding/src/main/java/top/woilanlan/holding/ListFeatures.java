package top.woilanlan.holding;

import top.woilanlan.typeinfo.pets.*;

import java.util.*;

/**
 * List 简单使用
 */
public class ListFeatures {

    public static void show() {
        Random rand = new Random(47);
        List<Pet> pets = Pets.arrayList(7);
        System.out.println("1: " + pets);
        Hamster h = new Hamster();
        pets.add(h);
        System.out.println("2: " + pets); //自动调整大小
        System.out.println("3: " + pets.contains(h));
        pets.remove(h); //对象被删除
        Pet p = pets.get(2);
        System.out.println("4: " + p + " " + pets.indexOf(p));
        Pet cymric = new Cymric();
        System.out.println("5: " + pets.indexOf(cymric));
        System.out.println("6: " + pets.remove(cymric));
        //必须是包含的对象才能删除
        System.out.println("7: " + pets.remove(p));
        System.out.println("8: " + pets);
        pets.add(3, new Mouse());    //在索引处插入
        System.out.println("9: " + pets);

        //从较大的列表中创建出一个列表，产生的列表其实对应的还是初始的列表
        //对sub列表的修改都会反映到初始列表中
        List<Pet> sub = pets.subList(1, 4);
        System.out.println("subList: " + sub);
        System.out.println("10: " + pets.containsAll(sub));
        Collections.sort(sub);  //适当的排序
        System.out.println("sorted subList: " + sub);
        // 顺序是不重要的在 containsAll()
        System.out.println("11: " + pets.containsAll(sub));
        Collections.shuffle(sub, rand);  //打乱顺序
        System.out.println("shuffled subList: " + sub);
        System.out.println("12: " + pets.containsAll(sub));

        List<Pet> copy = new ArrayList<Pet>(pets);
        sub = Arrays.asList(pets.get(1), pets.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);    // “交集”操作，保留了同时在copy和sub中的元素
        System.out.println("13: " + copy);
        copy = new ArrayList<Pet>(pets);    //获取一个新的
        copy.remove(2); // 通过索引删除
        System.out.println("14: " + copy);
        copy.removeAll(sub);    // 删除确切的对象组
        System.out.println("15: " + copy);
        copy.set(1, new Mouse());    // 替换一个元素
        System.out.println("16: " + copy);
        copy.addAll(2, sub); // 在中间插入一个list
        System.out.println("17: " + copy);
        System.out.println("18: " + pets.isEmpty());
        pets.clear();   // 移除所有的元素
        System.out.println("19: " + pets);
        System.out.println("20: " + pets.isEmpty());

        pets.addAll(Pets.arrayList(4));
        System.out.println("21: " + pets);
        //通过使用 toArray()，将任意的 Collection 转换为一个数组
        Object[] o = pets.toArray();
        System.out.println("22: " + o[3]);
        Pet[] pa = pets.toArray(new Pet[0]);    //如果参数数组太小，将创建一个具有合适尺寸的数组
        System.out.println("23: " + pa[3].id());
    }
}
