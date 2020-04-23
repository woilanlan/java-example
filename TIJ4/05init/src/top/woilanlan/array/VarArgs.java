package top.woilanlan.array;

class A {

}

/**
 * VarArgs 可变参数列表
 * 应用于参数个数或者类型未知的情况
 */
public class VarArgs {

    public static void printArray(Object[] args) {
        for (Object obj : args) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void show() {
        printArray(new Object[] { Integer.valueOf(47), Float.valueOf(3.14f), Double.valueOf(11.11d) });
        printArray(new Object[] { "one", "two", "three" });
        //没有定义toString()方法的话，就打印类的名字和对象的地址
        printArray(new Object[] { new A(), new A(), new A() });
    }
}