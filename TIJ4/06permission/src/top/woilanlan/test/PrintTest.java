package top.woilanlan.test;

import static top.woilanlan.util.Print.*;

import org.junit.Test;
/**
 * PrintTest
 * 对于静态导入，要遵循两个规则：
 * 尽量不要使用.*方式，除非是导入静态常量（只包含常量的类或接口）
 * 属性名和方法名具有明确、清晰的表象意义
 */
public class PrintTest {

    @Test
    public void testPrint() {
        print("Available from now no !");
        print(100);
        print(100L);
        print(3.14);
    }
}