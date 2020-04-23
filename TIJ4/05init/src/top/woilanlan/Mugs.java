package top.woilanlan;

class Mug {

    Mug(int marker) {
        System.out.println("Mug(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }

}

/**
 * Mugs 非静态实例初始化
 */
public class Mugs {
    Mug mug1;
    Mug mug2;
    
    //保证无论调用那个显示构造器，某些操作都会发生。
    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("Mug1 & Mug2 Initialized");
    }

    Mugs() {
        System.out.println("Mugs()");
    }

    Mugs(int i) {
        System.out.println("Mugs(" + i + ")");
    }

    static void show() {
        System.out.println("Inside main()");
        new Mugs();
        System.out.println("new Mugs() completed");
        new Mugs(1);
        System.out.println("new Mugs(1) completed");
    }

}