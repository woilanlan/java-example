package top.woilanlan.innerclasses;

class Egg{
    private Yolk y;
    protected class Yolk{
        public Yolk(){
            System.out.println("Egg.Yolk()");
        }
    }
    public Egg(){
        System.out.println("new Egg()");
        y = new Yolk();
    }
}

/**
 * BigEgg
 * 当继承了某个外部类的时候，内部类并没有被覆盖。
 * 这两个内部类时完全独立的个体，各自在自己的命名空间内。
 */
public class BigEgg extends Egg{

    public class Yolk{
        public Yolk(){
            System.out.println("BigEgg.Yolk()");
        }
    }
    public static void show() {
        new BigEgg();
    }
}