package top.woilanlan.polymorphism;

class StaticSuper {
    public static String staticGet() {
        return "Base staticGet()";
    }

    public String dynamicGet() {
        return "Base dynamicGet()";
    }
}

class StaticSub extends StaticSuper {

    public static String staticGet() {
        return "Derived staticGet()";
    }

    @Override
    public String dynamicGet() {
        return "Derived dynamicGet()";
    }
    
}

/**
 * StaticPolymorphism
 * 静态方法是与类，而非与单个的对象相关联的。
 */
public class StaticPolymorphism {

    public static void show() {
        StaticSuper sup = new StaticSub();
        System.out.println(sup.staticGet());
        System.out.println(sup.dynamicGet());

    }
}