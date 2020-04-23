package top.woilanlan.reuse;

class Art{
    Art(){
        System.out.println("Art constructor");
    }
}

class Drawing extends Art{
    Drawing(){
        System.out.println("Drawing constructor");
    }
}

/**
 * Cartoon
 * 初始化基类
 */
public class Cartoon extends Drawing{

    public Cartoon(){
        System.out.println("Cartoon constructor");
    }

    public static void show() {
        Cartoon x = new Cartoon();
        System.out.println(x);
    }
}