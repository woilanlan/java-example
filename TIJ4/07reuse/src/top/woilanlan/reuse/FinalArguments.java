package top.woilanlan.reuse;

class Gizmo{
    public void spin() {
        
    }
}

/**
 * FinalArguments
 * final参数
 */
public class FinalArguments {

    void with(final Gizmo g){
        //g = new Gizmo();
    }

    void without(Gizmo g){
        g = new Gizmo();
        g.spin();
    }

    void f(final int i){
        //i++;
    }

    int g(final int i){
        return i+1;
    }

    public static void show() {
        FinalArguments x = new FinalArguments();
        x.with(null);
        x.without(null);
    }
}