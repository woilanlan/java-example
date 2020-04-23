package top.woilanlan;

class Cup{
    Cup(int marker){
        System.out.println("Cup("+marker+")");
    }
    void f(int marker){
        System.out.println("f("+marker+")");
    }
}

class Cups{
    static Cup cup1;
    static Cup cup2;
    //仅执行一次
    static{
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups(){
        System.out.println("Cups()");
    }

}
/**
 * ExplicitStatic 显示的静态初始化
 */
public class ExplicitStatic {

    void show(){
        System.out.println("Inside main()");
        Cups.cup1.f(99);    // 1
    }

    //static Cups cups1 = new Cups();
}