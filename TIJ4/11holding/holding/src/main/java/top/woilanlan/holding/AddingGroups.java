package top.woilanlan.holding;

import java.util.*;

/**
 * 添加一组元素
 */
public class AddingGroups {
    public static void show(){
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Integer[] moreInts = {6,7,8,9,10};
        collection.addAll(Arrays.asList(moreInts));

        Collections.addAll(collection,11,12,13,14,15);
        Collections.addAll(collection,moreInts);

        //直接使用 Arrays.asList()的输出，将其当做 List
        //但是在这种情况下，其底层表示的是数组，因此不能调整大小
        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1,99); //修改一个元素
        //java.lang.UnsupportedOperationException
        //list.add(21);

        for (Integer i : collection) {
            System.out.print(i+",");
        }
    }
}
