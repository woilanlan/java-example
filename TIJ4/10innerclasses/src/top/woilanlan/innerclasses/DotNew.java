package top.woilanlan.innerclasses;

/**
 * DotNew
 * 创建某个内部类的对象
 * 必须在new表达式中提供对其他外部类对象的引用
 */
public class DotNew {

    public class Inner{

    }
    public static void show() {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}