package top.woilanlan.innerclasses;

class Egg2{
    protected class Yolk{
        public Yolk(){
            System.out.println("Egg2.Yolk()");
        }
        public void f(){
            System.out.println("Egg2.Yolk.f()");
        }
    }
    private Yolk y = new Yolk();

    public Egg2(){
        System.out.println("new Egg2()");
    }
    public void insertYolk(Yolk yy){
        y = yy;
    }
    public void g(){
        y.f();
    }
}

/**
 * BigEgg2
 * 有继承
 * 先初始化父类成员变量，构造函数
 * 再初始化子类成员变量，构造函数。
 * 
 * 外部类BigEgg2继承了Egg2
 * 所以内部类BigEgg2.Yolk在继承Egg2.Yolk可以
 * 默认构造函数可以访问到外围类对象Egg2的引用
 * 
 */
public class BigEgg2  extends Egg2{

    private String s = initS();

    public String initS(){
        System.out.println("initS");
        return "s";
    }

    public class Yolk extends Egg2.Yolk{
        public Yolk(){
            System.out.println("BigEgg2.Yolk()");
        }
        public void f(){
            System.out.println("BigEgg2.Yolk.f()");
        }
    }

    public BigEgg2(){
        System.out.println("constructor");
        insertYolk(new Yolk());
    }
    public static void show() {
        Egg2 e2 = new BigEgg2();
        e2.g();
    }
}