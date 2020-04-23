package top.woilanlan.array;

/**
 * VarArgType
 * 可变参数列表中可以使用任何类型的参数，包括基本类型
 */
public class VarArgType {

    public static void f(Character... args) {
        System.out.print(args.getClass());
        System.out.println("length = "+args.length);
    }

    public static void g(int... args) {
        System.out.print(args.getClass());
        System.out.println("length = "+args.length);
    }

    public static void show() {
        f('a');
        f();
        g(1);
        g();

        // int[] : class [I
        // getClass()方法，它将产生对象的类，
        // 并且在打印该类时，可以看到表示该类类型的编码字符串
        // 前导的 [ 表示这是一个后面紧随的类型的数组，I 表示基本类型int
        System.out.println("int[] : "+ new int[0].getClass());
    }
}