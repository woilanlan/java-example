package top.woilanlan.holding;

import java.util.ArrayList;

class GrannySmith extends Apple{}

class Gala extends Apple{}

class Fuji extends Apple{}

class Braeburn extends Apple{}

public class GenericsAndUpcasting {

    public static void show(){
        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        for (Apple c : apples) {
            //打印类名+该对象的散列码（无符号十六进制表示，通过 hashCode()方法产生）
            System.out.println(c);
        }
    }
}
