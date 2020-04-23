package top.woilanlan.polymorphism;

class Useful{
    public void f() {
        
    }
    public void g() {
        
    }
}

class MoreUseful extends Useful{
    public void f() {
        
    }
    public void g() {
        
    }
    public void u() {
        
    }
    public void v() {
        
    }
    public void w() {
        
    }
}

/**
 * RTTI 运行时类型识别
 */
public class RTTI {

    public static void show() {
        Useful[] x = {
            new Useful(),
            new MoreUseful()
        };
        // x[1].u();    //编译是错误
        MoreUseful m = (MoreUseful) x[1];   //向下转型
        m.u();
        m = (MoreUseful) x[0];  //异常：java.lang.ClassCastException
        m.u();
    }
}