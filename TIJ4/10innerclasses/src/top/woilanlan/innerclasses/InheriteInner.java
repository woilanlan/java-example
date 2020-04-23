package top.woilanlan.innerclasses;

class WithInner{
    class Inner{

    }
}

/**
 * InheriteInner 内部类的继承
 * 当要生成一个构造器时，默认的构造器不能只是传递一个外围类对象的引用，
 * 必须在构造器内使用如下语法：
 * enclosingClassReference.super()
 */
public class InheriteInner extends WithInner.Inner{

    // public InheriteInner() {}

    public InheriteInner(WithInner wi) {
        wi.super();
    }

    public static void show() {
        WithInner wi = new WithInner();
        InheriteInner ii = new InheriteInner(wi);
    }
}