package top.woilanlan.holding;

import java.util.ArrayList;

class Apple{
    private static long counter;
    private final long id = counter++;
    public long id(){
        return id;
    }
}

class Orange{}

/**
 * @SuppressWarnings("unchecked")
 * 示例没有使用泛型
 *
 */
public class ApplesAndOrangesWithoutGenerics 
{
    @SuppressWarnings("unchecked")
    public void show() {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
            ((Apple)apples.get(i)).id();
        }
    }
}
