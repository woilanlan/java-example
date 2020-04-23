package top.woilanlan.innerclasses;

abstract class Base{
    public Base(int i){
        System.out.println("Base Constructor, i "+ i);
    }
    public abstract void f();
}

/**
 * AnonymousConstructor
 * 通过实例初始化，达到为匿名内部类创建一个构造器的效果
 * 不要求变量i一定是final的，因为i被传递给匿名类的基类的构造器，
 * 并不会在匿名类内部被直接使用
 */
public class AnonymousConstructor {

    public static Base getBase(int i) {
        return new Base(i) {
            {
                System.out.println("Inside instance initializer");
            }
            @Override
            public void f() {
                System.out.println("In anonymous f()");
            }
        }; 
    }

    public static void show() {
        Base base = getBase(47);
        base.f();
    }
}