package top.woilanlan.strings;

/**
 * String 对象是不可变的，可以给一个String对象加任意多的别名
 * String 对象具有只读特性，所以指向它的任何引用都不可能改变它的值
 */
public class Concatenation {

    /**
     * 不可变性会带来一定的效率问题
     * 在处理 String 对象，使用的 “ + ” 进行了操作符重载。
     *
     * 查看代码如何工作的，
     * 将类编译成.class字节码文件,
     * 然后运行 JDK 自带的工具 javap 来反编译字节码文件
     * javap -c Concatenation
     */
    public static void show() {
        String mango = "mango";

        //如果通过生成新的 String 对象的方式实现
        //可能会生成一大堆需要垃圾回收的中间对象
        String s = "abc" + mango + "def" + 47;
        System.out.println(s);
    }
}
