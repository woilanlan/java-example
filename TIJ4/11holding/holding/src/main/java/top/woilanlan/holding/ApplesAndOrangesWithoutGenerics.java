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
 * 注解：告诉编译器忽略指定的警告，不用在编译完成后出现警告信息。
 * 忽略 unchecked 警告信息，如使用List，ArrayList等未进行参数化产生的警告信息。
 * 示例没有使用泛型
 *
 */
public class ApplesAndOrangesWithoutGenerics 
{
    @SuppressWarnings("unchecked")
    public static void show() {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
            //执行将会报错：java.lang.ClassCastException，不能将 Orange 转换成 Apple
            ((Apple)apples.get(i)).id();
        }
    }
}
