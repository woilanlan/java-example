package top.woilanlan.polymorphism;

class Super{
    public int field = 0;
    public int getField(){
        return field;
    }
}

class Sub extends Super{
    public int field = 1;
    public int getField(){
        return field;
    }
    public int getSuperField() {
        return super.field;
    }
}

/**
 * FieldAccess
 * 任何域访问操作都将由编译器解析，因此不是多态的。
 */
public class FieldAccess {

    public static void show() {
        Super sup = new Sub();
        System.out.println("sup.field = "+sup.field+
        ", sup.getField() = "+sup.getField());
        Sub sub = new Sub();
        System.out.println("sub.field = "+sub.field+
        ", sub.getField() = "+sub.getField()+
        ", sub.getSuperField() = "+ sub.getSuperField());
    }
}