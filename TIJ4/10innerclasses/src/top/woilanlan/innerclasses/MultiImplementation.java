package top.woilanlan.innerclasses;

class D{}

abstract class E{}

class Z extends D{
    E makE(){
        return new E() {};
    }
}

/**
 * MultiImpletation
 * 如果拥有的是抽象的类或者具体的类，而不是接口，
 * 那就只能使用内部类才能实现多重继承
 */
public class MultiImplementation {

    static void takeD(D d){}
    static void takeE(E d){}
    public static void show() {
        Z z = new Z();
        takeD(z);
        takeE(z.makE());
    }
}