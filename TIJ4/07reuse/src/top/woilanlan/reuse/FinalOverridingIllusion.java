package top.woilanlan.reuse;

class WithFinals{
    private final void f(){
        System.out.println("WithFinals.f()");
    }
    private void g(){
        System.out.println("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals{
    private final void f(){
        System.out.println("OverridingPrivate.f()");
    }
    //不属于基类接口的一部分
    private void g(){
        System.out.println("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate{
    //生成了一个新的方法
    public final void f(){
        System.out.println("OverridingPrivate2.f()");
    }
    public void g(){
        System.out.println("OverridingPrivate2.g()");
    }
}

/**
 * FinalOverridingIllusion
 * final和private关键字
 */
public class FinalOverridingIllusion extends OverridingPrivate2{

    //不能覆写方法f()
    // public void f() {
    //     System.out.println("FinalOverridingIllusion.f()");
    // }

    @Override
    public void g() {
        System.out.println("FinalOverridingIllusion.f()");
    }

    public static void show() {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        //可以向上转型，但无法调用方法
        OverridingPrivate op = op2;
        //op.g();
        //op.f();
        WithFinals wf = op2;
        //wf.g();
        //wf.f();
    }
    
}