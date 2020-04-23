package top.woilanlan.polymorphism;

class Meal{
    Meal(){
        System.out.println("Meal()");
    }
}

class Bread{
    Bread(){
        System.out.println("Bread()");
    }
}

class Cheese{
    Cheese(){
        System.out.println("Cheese()");
    }
}

class Lettuce{
    Lettuce(){
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal{
    Lunch(){
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch{
    PortableLunch(){
        System.out.println("PortableLunch()");
    }
}

/**
 * Sandwich 三明治
 * 调用基类构造器
 * 按声明顺序调用成员的初始化方法
 * 调用导出类构造器的主体
 */
public class Sandwich extends PortableLunch{

    //成员变量
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();

    public Sandwich(){
        System.out.println("Sandwich()");
    }

    public static void show() {
        new Sandwich();
    }
}