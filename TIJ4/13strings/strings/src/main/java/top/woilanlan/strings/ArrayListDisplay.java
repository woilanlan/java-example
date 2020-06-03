package top.woilanlan.strings;

import top.woilanlan.coffee.Coffee;
import top.woilanlan.coffee.CoffeeGenerator;

import java.util.ArrayList;

/**
 * ArrayList.toString()
 * 遍历 ArrayList 中包含的所有对象，调用每个元素上的 toString() 方法
 */
public class ArrayListDisplay {
    public static void show() {
        ArrayList<Coffee> coffees = new ArrayList<Coffee>();
        for (Coffee c : new CoffeeGenerator(10))
            coffees.add(c);
        System.out.println(coffees);
    }
}
