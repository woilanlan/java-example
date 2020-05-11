package top.woilanlan.holding;

import java.util.*;

/**
 * 容器的打印
 */
public class PrintingContainers {
    static Collection fill(Collection<String> collection){
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }

    static Map fill(Map<String,String> map){
        map.put("rat","Fuzzy");
        map.put("cat","Rags");
        map.put("dog","Bosco");
        map.put("dog","Spot");
        return map;
    }

    /**
     * ArrayList 和 LinkedList 都是 List 类型，都按照被插入的顺序保存元素
     * HashSet,TreeSet,LinkedHashSet 都是 Set 类型，每个相同的项只保存一次
     * HashSet 是最快获取元素的方式，
     * TreeSet 按照比较结果的升序保存对象
     * LinkedHashSet 按照被添加的顺序保存对象
     *
     * HashMap 提供了最快的查找方式
     * TreeMap 按照比较结果的升序保存键
     * LinkedHashMap 按照插入顺序保存键，同时保存了快的查找方式
     */
    public static void show(){

        System.out.println(fill(new ArrayList<>()));
        System.out.println(fill(new LinkedList<>()));
        System.out.println(fill(new HashSet<>()));
        System.out.println(fill(new TreeSet<>()));
        System.out.println(fill(new LinkedHashSet<>()));

        System.out.println(fill(new HashMap<String, String>()));
        System.out.println(fill(new TreeMap<String, String>()));
        System.out.println(fill(new LinkedHashMap<String, String>()));
    }
}
