package top.woilanlan.polymorphism;

class Derived extends PrivateOverride{
    public void f() {
        System.out.println("public f()");
    }
}

/**
 * PrivateOverride
 * 只有非private方法才可以被覆盖
 */
public class PrivateOverride {

    private void f(){
        System.out.println("private f()");
    }

    public static void show() {
        PrivateOverride po = new Derived();
        po.f();
    }
}