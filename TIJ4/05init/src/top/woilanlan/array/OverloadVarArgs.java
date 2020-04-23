package top.woilanlan.array;

/**
 * OverloadVarArgs 可变参数的重载
 */
public class OverloadVarArgs {

    public static void f(Character... args) {
        System.out.println("first");
        for (Character c : args) {
            System.out.print(" "+c);
        }
        System.out.println();
    }

    public static void f(Integer... args) {
        System.out.println("second");
        for (Integer i : args) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public static void f(Long... args) {
        System.out.println("third");
    }

    public static void show() {
        f('a','b','c');
        f(1);
        f(2,1);
        f(0);
        f(0L);
        
        //ambiguous 模棱两可的
        //f();
    }
}