package top.woilanlan;

/*
 * InitialValues 成员初始化
 * 所有的变量在使用前都要得到恰当的初始化，
 * 使用未初始化的局部变量，编译会报错，强制程序员提供一个初始值。
 * 类的每个基本类型数据成员都会有一个初始值
 * 在类中定义一个对象引用时，如果不将其初始化，此引用就会获得一个特殊值null
 * 
 */
public class InitialValues {

    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;

    InitialValues reference;

    void printInitialValues(){
        System.out.println("Data Type      Initial value");
        System.out.println("boolean        "+t);
        System.out.println("char          ["+c+"]");
        System.out.println("byte           "+b);
        System.out.println("short          "+s);
        System.out.println("int            "+i);
        System.out.println("long           "+l);
        System.out.println("f              "+f);
        System.out.println("d              "+d);
        System.out.println("reference      "+reference);
    }
}