package top.woilanlan.holding;

import top.woilanlan.typeinfo.pets.*;

import java.util.*;

import static top.woilanlan.util.Print.*;

/**
 * 将容器组合起来从而快速地生成强大的数据结构
 */
public class MapOfList {
    public static Map<Person, List<? extends Pet>>
            petPeople = new HashMap<Person, List<? extends Pet>>();

    static {
        petPeople.put(new Person("Dawn"), Arrays.asList(new Cymric("Molly"), new Mutt("Spot")));

        petPeople.put(new Person("Kate"),
                Arrays.asList(new Cat("Shackleton"),
                        new Cat("Elsie May"), new Dog("Margrett")));

        petPeople.put(new Person("Marilyn"),
                Arrays.asList(
                        new Pug("Louie aka Louis Snorkelstein Dupree"),
                        new Cat("Stanford aka Stinky el Negro"),
                        new Cat("Pinkola")));

        petPeople.put(new Person("Luke"),
                Arrays.asList(new Rat("Fuzzy"), new Rat("Fizzy")));

        petPeople.put(new Person("Isaac"),
                Arrays.asList(new Rat("Freckly")));
    }

    public static void show() {

        print("People: " + petPeople.keySet()); // 返回此 Map 中包含的键的 Set 集合
        print("Pets: " + petPeople.values());   // 返回此 Map 中包含的值的 集合

        //遍历
        for(Person person : petPeople.keySet()) {
            print(person + " has:");
            for(Pet pet : petPeople.get(person))
                print("    " + pet);
        }

        // 遍历方式2
        // 返回此 Map 中包含的 映射条目 的 set 集合
        for (Map.Entry<Person, List<? extends Pet>> entries : petPeople.entrySet()) {
            print(entries.getKey()+ " has:");   // 返回与此条目对应的键
            for(Pet pet : entries.getValue())   // 对应于该项的值
                print("    " + pet);
        }
    }
}
