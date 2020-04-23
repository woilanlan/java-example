package top.woilanlan.holding;

import java.util.ArrayList;

public class ApplesAndOrangesWithGenerics {

    public static void show() {
        ArrayList<Apple> apples = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        //通过使用泛型，就可以在编译期防止将错误类型的对象放置到容器中
        //apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
            System.out.println(apples.get(i).id());
        }
        for (Apple c : apples) {
            System.out.println(c.id());
        }
    }
}
