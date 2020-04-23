package top.woilanlan.array;

/**
 * OverloadVarArgs2
 */
public class OverloadVarArgs2 {

    public static void f(float i,Character... args) {
        System.out.println("first");
    }

    //这个方法也必须添加一个非可变参数。
    public static void f(char c,Character... args) {
        System.out.println("second");
    }

    public static void show() {
        f(1,'a');
        f('a','b');
    }
}